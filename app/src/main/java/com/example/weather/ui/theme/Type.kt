package com.example.weather.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.weather.R


val  poppins_regular= Font(R.font.poppins_regular)
val poppins_medium= Font(R.font.poppins_medium)
val poppins_bold= Font(R.font.poppins_bold)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FontFamily(poppins_bold),
        fontSize = 48.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = Color(0xFFFFFFFF)
    ),
    labelSmall = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(poppins_medium),
        fontWeight = FontWeight(700),
        color = Color(0xFFFFFFFF),
        letterSpacing = 0.3.sp,
    ),
    titleSmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(poppins_regular),
        fontWeight = FontWeight(400),
        color = Color(0xFFFFFFFF),
        letterSpacing = 0.3.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(poppins_bold),
        fontWeight = FontWeight(900),
        color = Color(0xFFFFFFFF),
        )

)