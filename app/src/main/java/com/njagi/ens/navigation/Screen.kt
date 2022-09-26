package com.njagi.ens.navigation

import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String
) {
    object OnboardingScreen : Screen(route = "boarding")
   object HomeScreen : Screen(route = "home")
//    object FeedsScreen : Screen(route = "feeds")
//    object SavedScreen : Screen(route = "saved")
//    object SettingsScreen : Screen(route = "settings")
//    object CategoryScreen : Screen(route = "category")
}
