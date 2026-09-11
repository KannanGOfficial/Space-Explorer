package dev.kannang.spaceexplorer.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.kannang.spaceexplorer.presentation.ui.theme.SpaceExplorerTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Text(
            text = "Home Screen"
        )
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    SpaceExplorerTheme {
        HomeScreen()
    }
}