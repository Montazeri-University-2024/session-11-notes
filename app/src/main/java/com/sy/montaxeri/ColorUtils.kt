package com.sy.montaxeri

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

private val colors = listOf(
    Color(0xffF6F0B9),
    Color(0xffBDF6B9),
    Color(0xffD2F7F5),
    Color(0xffD5FBDD),
    Color(0xffDFD2F7)
)

fun getRandomColor(): Color {
    val index = Random.nextInt(colors.size)
    return colors[index]
}