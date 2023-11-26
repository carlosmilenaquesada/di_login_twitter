package com.example.logininsta.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.di_login_twitter.R


@Composable
fun SocialLogin() {


    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Google\naccount", fontSize = 14.sp,
                color = Color(0xFF4EA8E9),
                textAlign = TextAlign.Center,
                lineHeight = 16.sp
            )

        }
        Column(Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Facebook\naccount", fontSize = 14.sp,
                color = Color(0xFF4EA8E9),
                textAlign = TextAlign.Center,
                lineHeight = 16.sp
            )

        }
        Column(Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Linkedin\naccount", fontSize = 14.sp,
                color = Color(0xFF4EA8E9),
                textAlign = TextAlign.Center,
                lineHeight = 16.sp
            )

        }

    }
}