package com.njagi.ens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.njagi.ens.data.DataStoreRepository
import com.njagi.ens.feature_presentation.category_view.CategoryScreen
import com.njagi.ens.feature_presentation.feeds_view.FeedsScreen
import com.njagi.ens.feature_presentation.home_view.HomeScreen
import com.njagi.ens.feature_presentation.onboarding_view.OnboardingScreen
import com.njagi.ens.feature_presentation.onboarding_view.OnboardingViewModel
import com.njagi.ens.feature_presentation.saved_view.SavedScreen
import com.njagi.ens.feature_presentation.settings_view.SettingsScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    startdestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startdestination
    ) {

        composable(route = Screen.OnboardingScreen.route) {
            OnboardingScreen(
                navController = navController,
                onboardingViewModel = OnboardingViewModel(repository = DataStoreRepository(context = LocalContext.current))
            )
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }
        composable(route = Screen.FeedsScreen.route) {
            FeedsScreen()
        }
        composable(route = Screen.SavedScreen.route) {
            SavedScreen()
        }
        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }
        composable(route = Screen.CategoryScreen.route) {
            CategoryScreen()
        }
    }
}