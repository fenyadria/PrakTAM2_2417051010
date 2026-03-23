package com.example.praktam2_2417051010.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.praktam2_2417051010.R

// Set of Material typography styles to start with
val ButlerFont = FontFamily(Font(R.font.butler))
val HelveticaFont = FontFamily(Font(R.font.helveticaroundedbold))

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = HelveticaFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = ButlerFont,
        fontWeight = FontWeight.Black,
        fontSize = 26.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = ButlerFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    )
)