package com.njagi.ens.feature_presentation.home_view


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.njagi.ens.feature_presentation.common_components.TopAppSection
import com.njagi.ens.navigation.BottomBar
import com.njagi.ens.navigation.HomeNavGraph


@Composable
fun HomeScreen(navHostController: NavHostController= rememberNavController()){
    Scaffold(
        topBar = { TopAppSection() },
       bottomBar = { BottomBar(navHostController = navHostController )},
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
              HomeNavGraph(navController = navHostController)
            }
    })


}