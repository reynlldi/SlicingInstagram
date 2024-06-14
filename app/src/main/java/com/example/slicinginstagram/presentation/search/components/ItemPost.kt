package com.example.slicinginstagram.presentation.search.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun ItemPost(
    imageUrl: String,
    username: String,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = "postingan $username",
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth()
    )
}