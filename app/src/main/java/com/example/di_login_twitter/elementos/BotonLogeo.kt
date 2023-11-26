package com.example.logininsta.LoginScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginButton(loginEnabled: Boolean) {

    Column(
        Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {

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
        Spacer(modifier = Modifier.fillMaxWidth().height(16.dp) )
        Text(
            text = "Don't have an account yet? Sign up here",
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 8.dp),
            color = Color(0xFF4EA8E9)
        )


    }


}