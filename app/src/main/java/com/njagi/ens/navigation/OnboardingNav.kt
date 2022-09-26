package com.njagi.ens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.njagi.ens.data.DataStoreRepository
import com.njagi.ens.feature_presentation.onboarding_view.OnboardingScreen
import com.njagi.ens.feature_presentation.onboarding_view.OnboardingViewModel

@Composable
fun OnboardingNav(
    navHostController: NavHostController
){
    NavHost(
        navController = navHostController,
        startDestination = Screen.OnboardingScreen.route,
        route = Graph.ONBOARDINGNAV_ROUTE
    ){
        //onboarding screen
        composable(route = Screen.OnboardingScreen.route) {
            OnboardingScreen(
                navController = navHostController,
                onboardingViewModel = OnboardingViewModel(repository = DataStoreRepository(context = LocalContext.current))
            )
        }

    }
}
