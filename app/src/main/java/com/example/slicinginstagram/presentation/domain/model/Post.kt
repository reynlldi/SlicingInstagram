package com.example.slicinginstagram.presentation.domain.model

data class Post(
    val id: Int,
    val username: String,
    val imageUrlProfile: String,
    val imageUrlPost: String,
    val descriptionPost: String,
    val datePost: String,
)
