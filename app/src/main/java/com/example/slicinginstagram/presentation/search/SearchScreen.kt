package com.example.slicinginstagram.presentation.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.slicinginstagram.presentation.data.local.DummyData
import com.example.slicinginstagram.presentation.domain.model.Post
import com.example.slicinginstagram.presentation.search.components.ItemPost
import com.example.slicinginstagram.presentation.search.components.SearchBar

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    val searchPost = DummyData.searchPost

    SearchContent(
        modifier = modifier,
        searchPost = searchPost
    )
}

@Composable
fun SearchContent(
    searchPost: List<Post>,
    modifier: Modifier = Modifier
) {
    var query by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            SearchBar(
                query = query,
                onQueryChange = { newQuery ->
                    query = newQuery
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(3),
            verticalItemSpacing = 4.dp,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            items(searchPost) { post ->
                ItemPost(imageUrl = post.imageUrlPost, username = post.username)
            }
        }
    }
}