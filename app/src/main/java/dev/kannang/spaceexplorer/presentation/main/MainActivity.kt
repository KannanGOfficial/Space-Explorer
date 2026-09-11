package dev.kannang.spaceexplorer.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.kannang.spaceexplorer.presentation.navigation.AppNavHost
import dev.kannang.spaceexplorer.presentation.ui.theme.SpaceExplorerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceExplorerTheme {
                AppNavHost()
            }
        }
    }
}