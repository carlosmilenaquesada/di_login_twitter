package com.example.logininsta.LoginScreen

import android.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(text = "Forgot Password?",
        fontSize = 8.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFB5B5B5),
        modifier = modifier)

}