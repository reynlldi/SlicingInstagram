package com.example.slicinginstagram.presentation.screen.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun StoryItem(
    username: String,
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = "$username profile",
            modifier = Modifier
                .border(
                    2.dp,
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFd71069),
                            Color(0xFFe25d6a),
                            Color(0xFFe9ad55)
                        )
                    ),
                    CircleShape
                )
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(text = username)
    }
}

@Preview(showBackground = true)
@Composable
private fun StoryItemPreview() {
    StoryItem(
        username = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
        imageUrl = "Anya Geraldine"
    )
}