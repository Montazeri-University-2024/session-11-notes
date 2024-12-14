package com.sy.montaxeri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.sy.montaxeri.api.Api
import com.sy.montaxeri.api.Note
import com.sy.montaxeri.ui.theme.MontaXeriTheme
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val retrofit = Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://185.243.48.179:8888/").build()

        val api = retrofit.create(Api::class.java)
        setContent {
            val coroutineScope = rememberCoroutineScope()
            val notes = remember {
                mutableStateListOf<Note>()
            }
            MontaXeriTheme {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Button(onClick = {
                        coroutineScope.launch {
                            val data = api.getNotes()
                            if (data.isSuccessful) {
                                data.body()?.let {
                                    notes.addAll(it.items)
                                }
                            }
                            println(data)
                        }
                    }) {
                        Text(text = "Get Notes")
                    }
                    LazyColumn {
                        items(items = notes) {
                            Text(text = it.collectionName)
                        }
                    }
                }
            }
        }
    }
}