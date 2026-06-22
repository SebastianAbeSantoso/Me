package com.example.tugasroom_tugasindividu_11.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.tugasroom_tugasindividu_11.ComicViewModel
import com.example.tugasroom_tugasindividu_11.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavHostController,
    viewModel: ComicViewModel,
    isLandscape: Boolean
){
    val listComics by viewModel.listComics.collectAsStateWithLifecycle()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(R.string.app_title),
                        style = MaterialTheme.typography.titleLarge
                    )},
                actions = { IconButton(onClick = {navController.navigate("settings") }) {
                        Icon(Icons.Default.Menu,
                            contentDescription = stringResource(R.string.cd_settings_menu))
                    }
                }
            )
        }
    ) {innerPadding ->

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ) {
            items(listComics) {item ->
                ComicList(item, isLandscape, navController, viewModel)
            }
        }
    }
}

@Composable
fun DetailsScreen(
    viewModel: ComicViewModel,
    navController: NavHostController,
    isLandscape: Boolean){
    val animeAdaptations by viewModel.animeAdaptations.collectAsStateWithLifecycle()
    val selectedComic by viewModel.selectedComic.collectAsStateWithLifecycle()
    val descFontSize =  if (isLandscape) 24.sp else 12.sp
    val descMaxLine = if (isLandscape) 3 else 15

    val titleFontSize = if (isLandscape) 32.sp else 40.sp
    val titleMaxLine = if (isLandscape) 1 else 10
    val titleLineHeight = 50.sp

    val authorFontSize = if (isLandscape) 24.sp else 20.sp
    val authorMaxLine = if (isLandscape) 1 else 3

    val genreFontSize = 20.sp
    val genreMaxLine = if (isLandscape) 1 else 3

    val buttonFontSize = if (isLandscape) 30.sp else 20.sp
    val cardHeight = if (isLandscape) 0.60f else 0.68f

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {innerPadding ->
        selectedComic?.let { comic ->
            val animeAdaptation = animeAdaptations.firstOrNull {
                it.comicId == comic.id
            }
            Box(modifier = Modifier.fillMaxSize()){
                Image(painter = painterResource(comic.backgroundImage),
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    contentDescription = stringResource(R.string.cd_bg_image))

                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.2f),
                                Color.Black.copy(alpha = 0.9f)
                            )
                        )
                    )
                )

                Column (modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize())
                {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(cardHeight)) {
                        ComicCard(
                            comic,
                            titleFontSize,
                            titleMaxLine,
                            titleLineHeight,
                            descFontSize,
                            descMaxLine,
                            authorFontSize,
                            authorMaxLine,
                            genreFontSize,
                            genreMaxLine,
                            navController,
                            viewModel
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 8.dp)
                            .background(
                                Color.Black.copy(alpha = 0.55f),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Anime Adaptation",
                            style = MaterialTheme.typography.titleMedium,
                            color = Color.White,
                            fontSize = 22.sp
                        )

                        if (animeAdaptation == null) {
                            Text(
                                text = "No anime adaptation found for comic id ${comic.id}",
                                color = Color.White,
                                fontSize = 18.sp
                            )
                        } else {
                            Text("Studio: ${animeAdaptation.studio}", color = Color.White, fontSize = 18.sp)
                            Text("Release Year: ${animeAdaptation.releaseYear}", color = Color.White, fontSize = 18.sp)
                            Text("Episodes: ${animeAdaptation.episodeCount}", color = Color.White, fontSize = 18.sp)
                            Text("Status: ${animeAdaptation.status}", color = Color.White, fontSize = 18.sp)
                        }
                    }

                    Button(onClick = { navController.popBackStack()
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp), shape = RoundedCornerShape(10.dp)) {
                        Text(text = stringResource(R.string.btn_return), modifier = Modifier.padding(end = 10.dp), fontSize = buttonFontSize, textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}