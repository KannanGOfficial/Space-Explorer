package dev.kannang.spaceexplorer.presentation.search

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.kannang.spaceexplorer.presentation.ui.theme.SpaceExplorerTheme

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Text(
            text = "Search Screen"
        )
    }
}

@Preview
@Composable
private fun SearchScreenPreview() {
    SpaceExplorerTheme {
        SearchScreen()
    }
}