package com.njagi.ens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.njagi.ens.feature_presentation.home_view.HomeScreen
import com.njagi.ens.feature_presentation.onboarding_view.OnboardingScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    startdestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startdestination,
        route = Graph.ROOTNAV_ROUTE

    ) {

        composable(route = Graph.ONBOARDINGNAV_ROUTE){
            OnboardingScreen()
        }

        composable(route = Graph.HOMENAV_ROUTE){
            HomeScreen()
        }


    }
}

object Graph {
    const val ROOTNAV_ROUTE = "RootRoute"
    const val ONBOARDINGNAV_ROUTE = "OnboardingRoute"
    const val HOMENAV_ROUTE = "HomeNavRoute"
    const val DETAILS = "DetailsNavRoute"
}