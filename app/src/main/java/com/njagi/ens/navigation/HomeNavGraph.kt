package com.njagi.ens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.njagi.ens.feature_presentation.feeds_view.FeedsScreen
import com.njagi.ens.feature_presentation.home_view.HomeScreen
import com.njagi.ens.feature_presentation.saved_view.SavedScreen
import com.njagi.ens.feature_presentation.settings_view.SettingsScreen

@Composable
fun HomeNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Feed.route,
        route = Graph.HOMENAV_ROUTE
    ){
//        //Home
//        composable(route = Screen.HomeScreen.route) {
//            HomeScreen()
//        }
        //Feeds
        composable(route = BottomBarScreen.Feed.route) {
            FeedsScreen()
        }

        //saved/favourites
        composable(route = BottomBarScreen.Saved.route) {
            SavedScreen()
        }

        //settings
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }

        //settings
        composable(route = BottomBarScreen.Profile.route){
            SettingsScreen()
        }

    }
}


