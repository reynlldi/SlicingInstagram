package com.example.slicinginstagram.presentation.utils

import com.example.slicinginstagram.presentation.navigation.Screen

fun String?.shouldShowBottomBar(): Boolean{
    return this in setOf(
        Screen.Home.route,
        Screen.Search.route,
        Screen.Reels.route,
        Screen.AddPosting.route,
        Screen.Profile.route
    )
}