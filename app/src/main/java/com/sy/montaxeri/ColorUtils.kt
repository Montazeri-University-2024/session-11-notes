package com.sy.montaxeri

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

private val colors = listOf(
    Color(0xffF6F0B9),
    Color(0xffBDF6B9),
    Color(0xffD2F7F5),
    Color(0xffD5FBDD),
    Color(0xffDFD2F7),
    Color(0xffF7D6D6), // Soft Pink
    Color(0xffF7E0D2), // Warm Peach
    Color(0xffC7E3F7), // Light Sky Blue
    Color(0xffE3F7C7), // Pale Lime Green
    Color(0xffF7D2E9), // Light Lavender Pink
    Color(0xffF7F5C2), // Pale Yellow
    Color(0xffC2F7C5), // Mint Green
    Color(0xffC2F7F1), // Aqua Mint
    Color(0xffE1C2F7), // Lilac
    Color(0xffF7C2C2), // Salmon Pink
    Color(0xffF7BFBF), // Light Coral
    Color(0xffF7F0D5), // Beige
    Color(0xffD5F7E0), // Pastel Mint
    Color(0xffB9DFF6), // Powder Blue
    Color(0xffD5D2F7), // Soft Periwinkle
    Color(0xffF7B9F0), // Light Magenta
    Color(0xffF7C9B9), // Peach Puff
    Color(0xffB9F7E6), // Seafoam
    Color(0xffD2F7B9), // Light Pistachio
    Color(0xffF7D2C9), // Soft Rose
    Color(0xffC9E2F7), // Ice Blue
    Color(0xffB9F7D5), // Turquoise Green
    Color(0xffF7C9F0), // Orchid Pink
    Color(0xffD7B9F7), // Lavender Purple
    Color(0xffF7D7B9), // Apricot
    Color(0xffF7E7B9), // Creamy Yellow
)

fun getRandomColor(): Color {
    val index = Random.nextInt(colors.size)
    return colors[index]
}