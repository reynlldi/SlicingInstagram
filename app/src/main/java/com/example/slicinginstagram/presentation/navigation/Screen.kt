package com.example.slicinginstagram.presentation.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home_screen")
    data object Search : Screen("search_screen")
    data object AddPosting : Screen("addPosting_screen")
    data object Reels : Screen("reels_screen")
    data object Profile : Screen("profile_screen")
    data object Splash : Screen("splash_screen")
}