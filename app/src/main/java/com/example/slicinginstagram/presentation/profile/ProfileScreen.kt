package com.example.slicinginstagram.presentation.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.slicinginstagram.presentation.data.local.DummyData
import com.example.slicinginstagram.presentation.domain.model.Post
import com.example.slicinginstagram.presentation.profile.components.ButtonProfile
import com.example.slicinginstagram.presentation.profile.components.PostProfileItem
import com.example.slicinginstagram.presentation.profile.components.ProfileItem
import com.example.slicinginstagram.presentation.profile.components.StoryItem

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val stories = DummyData.posts

    ProfileContent(
        modifier = modifier,
        stories = stories
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileContent(
    stories: List<Post>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Outlined.Lock, contentDescription = "icon lock")
                        Text(text = "Reynlldi")
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "icon dropdown"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.Tag, contentDescription = "icon threads")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.AddBox, contentDescription = "icon add")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "icon menu")
                    }
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ProfileItem()
            ButtonProfile()
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(stories) { stories ->
                    StoryItem(
                        imageUrl = stories.imageUrlPost,
                        description = stories.descriptionPost
                    )
                }
            }
            PostProfileItem()
        }
    }
}