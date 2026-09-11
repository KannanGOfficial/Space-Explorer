package dev.kannang.spaceexplorer.presentation.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object HomeScreen : NavKey

@Serializable
data object ExploreScreen : NavKey

@Serializable
data object SearchScreen : NavKey
