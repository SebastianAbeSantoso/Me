package com.example.tugasroom_tugasindividu_11.domain.model

import com.example.tugasroom_tugasindividu_11.R
import com.example.tugasroom_tugasindividu_11.data.local.ComicDao
import kotlinx.coroutines.flow.Flow

class ComicRepository(
    private val comicDao: ComicDao
) {
    fun getAllComics(): Flow<List<Comic>> {
        return comicDao.getAllComics()
    }

    suspend fun seedInitialData() {
        val comics = comicDao.getAllComicsOnce()
        val adaptations = comicDao.getAllAnimeAdaptationsOnce()

        val initialComics = listOf(
            Comic(
                "The King's Avatar",
                R.drawable.cv_li_6,
                R.drawable.bg_li_6,
                "https://anilist.co/anime/98861/Quanzhi-Gaoshou/",
                listOf(R.string.the_kings_avatar),
                listOf(R.string.genre_action, R.string.genre_comedy, R.string.genre_fantasy),
                "Blue Butterfly, Yuewen Animation & Comics",
                1
            ),
            Comic(
                "Lord of the Mysteries",
                R.drawable.cv_cr_6,
                R.drawable.bg_cr_6,
                "https://anilist.co/anime/137667/Guimi-Zhi-Zhu",
                listOf(R.string.lord_of_the_mysteries),
                listOf(R.string.genre_transmigration, R.string.genre_historical, R.string.genre_action),
                "Cuttlefish That Loves Diving (爱潜水的乌贼), sevenballoon",
                2
            )
        )

        val initialAnimeAdaptations = listOf(
            AnimeAdaptation(
                comicId = 1,
                studio = "B.CMAY Pictures",
                releaseYear = 2017,
                episodeCount = 12,
                status = "Released"
            ),
            AnimeAdaptation(
                comicId = 2,
                studio = "B.CMAY Pictures",
                releaseYear = 2025,
                episodeCount = 13,
                status = "Released"
            )
        )

        if (comics.isEmpty()) {
            comicDao.insertComics(initialComics)
        }

        if (adaptations.isEmpty()) {
            comicDao.insertAnimeAdaptations(initialAnimeAdaptations)
        }
    }
}