package com.example.tugasroom_tugasindividu_11.data.local

import androidx.room.TypeConverter

class ComicConverters {
    @TypeConverter
    fun fromIntList(value: List<Int>): String {
        return value.joinToString(",")
    }

    @TypeConverter
    fun toIntList(value: String): List<Int> {
        return if (value.isBlank()) {
            emptyList()
        } else {
            value.split(",").map { it.toInt() }
        }
    }
}