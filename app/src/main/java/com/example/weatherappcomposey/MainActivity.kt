package com.example.weatherappcomposey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherappcomposey.screens.MainScreen
import com.example.weatherappcomposey.ui.theme.WeatherAppComposeYTheme

const val API_KEY = "dccb43f4250740a0901150758231007"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeYTheme {
                MainScreen()
            }
        }
    }
}
