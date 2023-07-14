package com.example.weatherappcomposey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.weatherappcomposey.screens.MainCard
import com.example.weatherappcomposey.screens.TabLayout
import com.example.weatherappcomposey.ui.theme.WeatherAppComposeYTheme

const val API_KEY = "dccb43f4250740a0901150758231007"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeYTheme {
                Image(
                    painter = painterResource(id = R.drawable.sky),
                    contentDescription = "im1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.8f),
                    contentScale = ContentScale.FillBounds
                )
                Column {
                    MainCard()
                    TabLayout()
                }
            }
        }
    }
}
