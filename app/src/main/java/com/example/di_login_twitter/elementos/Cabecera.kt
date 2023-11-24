package com.example.di_login_twitter.elementos

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.di_login_twitter.R

@Composable

fun Cabecera(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.logotwitter),
        contentDescription = null,
        modifier = modifier
    )
    Text(text = "Log in to Twitter")

}