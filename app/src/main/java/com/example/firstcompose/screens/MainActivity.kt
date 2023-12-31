package com.example.firstcompose.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            profileScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeTheme {
        profileScreen()
    }
}