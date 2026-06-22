package com.example.tugasroom_tugasindividu_11.domain.model

import androidx.room.Embedded
import androidx.room.Relation

data class ComicWithAnimeAdaptations(
    @Embedded val comic: Comic,

    @Relation(
        parentColumn = "id",
        entityColumn = "comicId"
    )
    val animeAdaptations: List<AnimeAdaptation>
)