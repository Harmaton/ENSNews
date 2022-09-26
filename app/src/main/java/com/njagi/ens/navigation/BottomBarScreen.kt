package com.njagi.ens.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Feed: BottomBarScreen(
        "feed",
        "Feed",
        Icons.Rounded.Home
    )
    object Profile: BottomBarScreen(
        "profile",
        "Profile",
        Icons.Rounded.Person
    )
    object Settings: BottomBarScreen(
        "settings",
        "Settings",
        Icons.Rounded.Settings
    )
    object Saved: BottomBarScreen(
        "saved",
        "saved",
        Icons.Rounded.Favorite
    )
}