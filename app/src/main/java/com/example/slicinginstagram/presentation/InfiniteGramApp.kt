package com.example.slicinginstagram.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.slicinginstagram.presentation.addposting.AddPostingScreen
import com.example.slicinginstagram.presentation.components.BottomBar
import com.example.slicinginstagram.presentation.navigation.Screen
import com.example.slicinginstagram.presentation.profile.ProfileScreen
import com.example.slicinginstagram.presentation.reels.ReelsScreen
import com.example.slicinginstagram.presentation.screen.HomeScreen
import com.example.slicinginstagram.presentation.search.SearchScreen
import com.example.slicinginstagram.presentation.splash.SplashScreen

@Composable
fun InfiniteGramApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomBar(navHostController = navHostController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.Splash.route,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route){
                HomeScreen()
            }

            composable(Screen.Search.route){
                SearchScreen()
            }

            composable(Screen.AddPosting.route){
                AddPostingScreen()
            }

            composable(Screen.Reels.route){
                ReelsScreen()
            }

            composable(Screen.Profile.route){
                ProfileScreen()
            }

            composable(Screen.Splash.route){
                SplashScreen(navController = navHostController)
            }
        }
    }
}