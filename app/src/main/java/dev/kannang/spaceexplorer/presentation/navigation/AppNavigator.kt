package dev.kannang.spaceexplorer.presentation.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

class AppNavigator(
    private val backStack : NavBackStack<NavKey>
) {
    fun navigateTo(route: NavKey) {
        backStack.add(route)
    }

    fun selectBottomTab(route: NavKey) {
        val current = backStack.lastOrNull()
         if(current == route) return

        val index = backStack.indexOf(route)

        if(index >= 0){
            val item = backStack.removeAt(index)
            backStack.add(item)
        } else {
            backStack.add(route)
        }
    }
}