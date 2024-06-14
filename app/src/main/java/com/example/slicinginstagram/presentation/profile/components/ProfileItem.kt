package com.example.slicinginstagram.presentation.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfileItem(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box {
                AsyncImage(
                    model = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
                    contentDescription = "profile",
                    modifier = Modifier
                        .border(4.dp, Color.LightGray.copy(0.2f), CircleShape)
                        .padding(8.dp)
                        .size(80.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = "icon add story",
                    modifier = Modifier
                        .offset(x = 65.dp, y = 65.dp)
                        .size(24.dp)
                        .background(Color.White, shape = CircleShape),
                    tint = Color.Blue
                )
            }
            Text(text = "Reynlldi")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "0")
            Text(text = "Postingan")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "1000")
            Text(text = "Pengikut")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "1")
            Text(text = "Mengikuti")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileItemPreview() {
    ProfileItem()
}