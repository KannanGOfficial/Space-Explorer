package dev.kannang.spaceexplorer.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import dev.kannang.spaceexplorer.presentation.explore.ExploreRoot
import dev.kannang.spaceexplorer.presentation.home.HomeRoot
import dev.kannang.spaceexplorer.presentation.search.SearchRoot

@Composable
fun AppNavHost(modifier: Modifier = Modifier) {

    val backstack = rememberNavBackStack(HomeScreen)
    val navigator = remember(backstack) { AppNavigator(backstack) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                backstack = backstack,
                navigator = navigator
            )
        }
    ) { paddingValues ->

        NavDisplay(
            modifier = modifier.padding(paddingValues),
            backStack = backstack,
            entryProvider = entryProvider {
                entry<HomeScreen> {
                    HomeRoot()
                }
                entry<SearchScreen> {
                    SearchRoot()
                }
                entry<ExploreScreen> {
                    ExploreRoot()
                }
            }
        )
    }
}
