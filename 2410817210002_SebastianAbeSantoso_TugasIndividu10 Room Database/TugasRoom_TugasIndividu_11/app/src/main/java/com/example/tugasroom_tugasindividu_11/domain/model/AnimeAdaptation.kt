package com.example.tugasroom_tugasindividu_11.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "anime_adaptations",
    foreignKeys = [
        ForeignKey(
            entity = Comic::class,
            parentColumns = ["id"],
            childColumns = ["comicId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("comicId")]
)
data class AnimeAdaptation(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val comicId: Int,
    val studio: String,
    val releaseYear: Int,
    val episodeCount: Int,
    val status: String
)