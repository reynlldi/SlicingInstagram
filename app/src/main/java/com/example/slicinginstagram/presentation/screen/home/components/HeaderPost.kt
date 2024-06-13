package com.example.slicinginstagram.presentation.screen.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
fun HeaderPost(
    imageUrlProfile: String,
    username: String,
    datePost: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth().padding(8.dp)
    ) {
        AsyncImage(
            model = imageUrlProfile,
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
                .size(40.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = username, style = MaterialTheme.typography.titleSmall, modifier = Modifier)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = datePost, style = MaterialTheme.typography.bodySmall, modifier = Modifier)
        }
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Option Icon", modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
private fun HeaderPostPreview() {
    HeaderPost(imageUrlProfile = "", username = "anya", datePost = "1 hari yang lalu")
}