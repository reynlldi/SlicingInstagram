package com.example.slicinginstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.slicinginstagram.presentation.InfiniteGramApp
import com.example.slicinginstagram.presentation.screen.HomeScreen
import com.example.slicinginstagram.ui.theme.SlicingInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SlicingInstagramTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    InfiniteGramApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}