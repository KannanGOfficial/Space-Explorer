package dev.kannang.spaceexplorer.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

enum class BottomBar(val label: String, val route: NavKey, val icon: ImageVector) {
    HOME(
        label = "Home",
        route = HomeScreen,
        icon = Icons.Default.Home
    ),
    EXPLORE(
        label = "Explore",
        route = ExploreScreen,
        icon = Icons.Default.Favorite
    ),
    SEARCH(
        label = "Search",
        route = SearchScreen,
        icon = Icons.Default.Search
    )
}

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    backstack: NavBackStack<NavKey>,
    navigator: AppNavigator
) {
    NavigationBar(
        modifier = modifier,
        windowInsets = NavigationBarDefaults.windowInsets
    ) {
        BottomBar.entries.forEach { bar ->
            NavigationBarItem(
                selected = backstack.lastOrNull() == bar.route,
                onClick = {
                    navigator.selectBottomTab(bar.route)
                },
                icon = {
                    Icon(
                        imageVector = bar.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = bar.label
                    )
                }
            )
        }
    }
}