package com.example.tugasroom_tugasindividu_11

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.platform.LocalConfiguration
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasroom_tugasindividu_11.ui.DetailsScreen
import com.example.tugasroom_tugasindividu_11.ui.MainScreen
import com.example.tugasroom_tugasindividu_11.ui.theme.TugasRoom_TugasIndividu_11Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasRoom_TugasIndividu_11Theme(darkTheme = true) {
                val navController = rememberNavController()
                val viewModel: ComicViewModel = viewModel()
                val isLandscape = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE

                NavHost(navController, startDestination = "main") {
                    composable("main") {
                        MainScreen(navController, viewModel, isLandscape)
                    }
                    composable ("details"){
                        DetailsScreen(viewModel, navController, isLandscape)
                    }
                }
            }
        }
    }
}
