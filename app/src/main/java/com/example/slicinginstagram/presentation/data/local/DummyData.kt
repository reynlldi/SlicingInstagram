package com.example.slicinginstagram.presentation.data.local

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.VideoLibrary
import com.example.slicinginstagram.presentation.domain.model.Post
import com.example.slicinginstagram.presentation.domain.model.User
import com.example.slicinginstagram.presentation.navigation.NavigationItem
import com.example.slicinginstagram.presentation.navigation.Screen

object DummyData {
    val users = listOf(
        User(
            id = 1,
            imageUrl = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            username = "Reynaldi"
        ),
        User(
            id = 2,
            imageUrl = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            username = "Anya"
        ),
        User(
            id = 3,
            imageUrl = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            username = "Anya"
        ),
        User(
            id = 4,
            imageUrl = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            username = "Anya"
        ),
        User(
            id = 5,
            imageUrl = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            username = "Anya"
        ),
        User(
            id = 6,
            imageUrl = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            username = "Anya"
        ),
    )

    val posts = listOf(
        Post(
            id = 1,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 2,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 3,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 4,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 5,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 6,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        )
    )

    val bottomBarItems = listOf(
        NavigationItem(
            title = "Home",
            unselectedIcon = Icons.Outlined.Home,
            selectedIcon = Icons.Filled.Home,
            screen = Screen.Home
        ),
        NavigationItem(
            title = "Search",
            unselectedIcon = Icons.Outlined.Search,
            selectedIcon = Icons.Filled.Search,
            screen = Screen.Search
        ),
        NavigationItem(
            title = "AddPosting",
            unselectedIcon = Icons.Outlined.AddBox,
            selectedIcon = Icons.Filled.AddBox,
            screen = Screen.AddPosting
        ),
        NavigationItem(
            title = "Reels",
            unselectedIcon = Icons.Outlined.VideoLibrary,
            selectedIcon = Icons.Filled.VideoLibrary,
            screen = Screen.Reels
        ),
        NavigationItem(
            title = "Profile",
            unselectedIcon = Icons.Outlined.AccountCircle,
            selectedIcon = Icons.Filled.AccountCircle,
            screen = Screen.Profile
        ),
    )

    val searchPost = listOf(
        Post(
            id = 1,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 2,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 3,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://th.bing.com/th/id/OIP.bwTTtN95_22_A8ZqjC8HxwHaNK?w=187&h=333&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 4,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 5,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 6,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 7,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://th.bing.com/th/id/OIP.bwTTtN95_22_A8ZqjC8HxwHaNK?w=187&h=333&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 8,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 9,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 10,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 11,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://th.bing.com/th/id/OIP.bwTTtN95_22_A8ZqjC8HxwHaNK?w=187&h=333&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 12,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 13,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        ),
        Post(
            id = 14,
            username = "anya",
            imageUrlProfile = "https://www.lyceum.id/wp-content/uploads/3798496899.jpg",
            imageUrlPost = "https://media.licdn.com/dms/image/D5603AQHKnMiPlkFrgw/profile-displayphoto-shrink_800_800/0/1696302408818?e=1723680000&v=beta&t=8BCMu06g4Ngb868bzW6H75cm2XC-AmJxrcSFJZ8cUWk",
            descriptionPost = "Kesayangan aku",
            datePost = "5 jam yang lalu"
        )

    )
}