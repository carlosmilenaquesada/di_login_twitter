package com.example.logininsta.LoginScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun LoginButton(loginEnabled: Boolean) {
    Button(
        onClick = {},
        enabled = loginEnabled,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp),
        colors = ButtonDefaults.buttonColors(
            disabledContentColor = Color.White,
            contentColor = Color.White,
            containerColor = Color(0xFFF4F8F9),
            disabledContainerColor = Color(0xFF78F8F9)

        ),
        shape = RoundedCornerShape(10)
    ) {
        Text(text = "Log in")
    }
}