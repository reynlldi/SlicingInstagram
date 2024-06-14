package com.example.slicinginstagram.presentation.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.slicinginstagram.R
import com.example.slicinginstagram.presentation.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    SplashContent(
        modifier = modifier,
        navController = navController
    )
}

@Composable
fun SplashContent(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LaunchedEffect(key1 = true) {
        delay(500)
        navController.navigate(Screen.Home.route) {
            popUpTo(Screen.Splash.route) {
                inclusive = true
            }
        }
    }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.app_icon),
            contentDescription = "logo ig",
            modifier = Modifier.size(100.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text(text = "From", fontWeight = FontWeight.ExtraLight)
            Image(
                painter = painterResource(id = R.drawable.ic_meta),
                contentDescription = "icon meta",
                modifier = Modifier
                    .size(60.dp)
                    .padding(16.dp)
            )
        }
    }
}