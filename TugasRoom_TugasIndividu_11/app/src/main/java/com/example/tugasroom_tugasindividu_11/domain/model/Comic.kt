package com.example.tugasroom_tugasindividu_11.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comics")
data class Comic(
    val title: String,
    val coverImage: Int,
    val backgroundImage: Int,
    val url: String,
    val description: List<Int>,
    val genres: List<Int>,
    val author: String,
    @PrimaryKey
    val id: Int
)