package com.example.tugasroom_tugasindividu_11.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.tugasroom_tugasindividu_11.domain.model.Comic
import com.example.tugasroom_tugasindividu_11.domain.model.AnimeAdaptation
import com.example.tugasroom_tugasindividu_11.domain.model.ComicWithAnimeAdaptations
import kotlinx.coroutines.flow.Flow

@Dao
interface ComicDao {
    @Query("SELECT * FROM comics")
    fun getAllComics(): Flow<List<Comic>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComics(comics: List<Comic>)

    @Transaction
    @Query("SELECT * FROM comics")
    fun getComicsWithAnimeAdaptations(): Flow<List<ComicWithAnimeAdaptations>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnimeAdaptations(adaptations: List<AnimeAdaptation>)

    @Query("SELECT * FROM comics")
    suspend fun getAllComicsOnce(): List<Comic>

    @Query("SELECT * FROM anime_adaptations")
    fun getAllAnimeAdaptations(): Flow<List<AnimeAdaptation>>

    @Query("SELECT * FROM anime_adaptations")
    suspend fun getAllAnimeAdaptationsOnce(): List<AnimeAdaptation>
}