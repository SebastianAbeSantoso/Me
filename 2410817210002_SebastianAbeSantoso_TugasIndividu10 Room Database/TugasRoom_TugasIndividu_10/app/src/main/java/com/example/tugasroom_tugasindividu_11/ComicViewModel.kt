package com.example.tugasroom_tugasindividu_11

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.tugasroom_tugasindividu_11.data.local.AppDatabase
import com.example.tugasroom_tugasindividu_11.domain.model.AnimeAdaptation
import com.example.tugasroom_tugasindividu_11.domain.model.Comic
import com.example.tugasroom_tugasindividu_11.domain.model.ComicRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ComicViewModel(application: Application) : AndroidViewModel(application) {
    private val comicDao = AppDatabase.getDatabase(application).comicDao()
    private val repository = ComicRepository(comicDao)

    private val _listComics = MutableStateFlow<List<Comic>>(emptyList())
    private val _selectedComic = MutableStateFlow<Comic?>(null)

    val listComics = _listComics.asStateFlow()
    val selectedComic = _selectedComic.asStateFlow()

    private val _animeAdaptations = MutableStateFlow<List<AnimeAdaptation>>(emptyList())
    val animeAdaptations = _animeAdaptations.asStateFlow()

    init {
        viewModelScope.launch {
            repository.seedInitialData()
        }

        viewModelScope.launch {
            repository.getAllComics().collect { comics ->
                _listComics.value = comics.take(4)
            }
        }

        viewModelScope.launch {
            comicDao.getAllAnimeAdaptations().collect { adaptations ->
                _animeAdaptations.value = adaptations
            }
        }
    }

    fun selectComic(comic: Comic) {
        _selectedComic.value = comic
    }
}
