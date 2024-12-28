package com.sy.montaxeri.api

import androidx.compose.ui.graphics.Color

data class Note(
    val collectionId: String,
    val collectionName: String,
    val title: String,
    val content: String,
    var color: Color = Color(0xffF6F0B9)
)
