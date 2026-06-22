package com.example.tugasroom_tugasindividu_11.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.tugasroom_tugasindividu_11.domain.model.Comic
import com.example.tugasroom_tugasindividu_11.domain.model.AnimeAdaptation

@Database(
    entities = [
        Comic::class,
        AnimeAdaptation::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(ComicConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun comicDao(): ComicDao
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "comic_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}