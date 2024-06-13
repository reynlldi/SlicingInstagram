package com.example.slicinginstagram.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.slicinginstagram.presentation.data.local.DummyData
import com.example.slicinginstagram.presentation.domain.model.Post
import com.example.slicinginstagram.presentation.domain.model.User
import com.example.slicinginstagram.presentation.screen.home.components.PostItem
import com.example.slicinginstagram.presentation.screen.home.components.StoryItem

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val users = DummyData.users
    val posts = DummyData.posts

    HomeContent(
        modifier = modifier,
        users = users,
        posts = posts
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    users: List<User>,
    posts: List<Post>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "InfiniteGram")
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "favorite icon"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Chat,
                            contentDescription = "chat icon"
                        )
                    }
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(16.dp),
                ) {
                    items(users) { users ->
                        StoryItem(username = users.username, imageUrl = users.imageUrl)
                    }
                }
            }
            items(posts) { post ->
                PostItem(
                    imageUrlProfile = post.imageUrlProfile,
                    username = post.username,
                    datePost = post.datePost,
                    imageUrlPost = post.imageUrlPost,
                    description = post.descriptionPost
                )
            }
        }
    }
}