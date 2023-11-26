package com.example.logininsta.LoginScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.core.util.PatternsCompat

@Composable
fun Body(modifier: Modifier) {
    var email by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var isLoginEnable by rememberSaveable {
        mutableStateOf(false)
    }
    isLoginEnable = password.isNotEmpty() && isValidEmail(email);
    Column(modifier = modifier) {
        ImageLogo(Modifier.align(Alignment.CenterHorizontally));
        Spacer(modifier = Modifier.size(16.dp))
        Email(email = email) {
            email = it
        }
        Spacer(modifier = Modifier.size(4.dp))
        Password(password = password) {
            password = it
        }
        Spacer(modifier = Modifier.size(16.dp))
        LoginButton(isLoginEnable)
        Spacer(modifier = Modifier.size(25.dp))
        LoginDivider()
        Spacer(modifier = Modifier.size(32.dp))
        SocialLogin()
        Spacer(modifier = Modifier.size(16.dp))
        ForgotPassword(modifier = Modifier.align(Alignment.CenterHorizontally))

    }
}

fun isValidEmail(email: String): Boolean {
    return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches();
}
