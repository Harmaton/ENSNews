package com.njagi.ens.feature_presentation.onboarding_view


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.*
import com.njagi.ens.navigation.Graph
import com.njagi.ens.navigation.OnboardingNav
import com.njagi.ens.navigation.Screen


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(
    navController: NavHostController = rememberNavController(),
    onboardingViewModel : OnboardingViewModel = viewModel()
) {
    val pagerState = rememberPagerState(initialPage = 0)

    val pages = listOf(
        Page.First,
        Page.Second,
        Page.Third
    )
Scaffold() {paddingValues ->

    Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {

        OnboardingNav(navHostController = navController)

        HorizontalPager(count = 3,
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
                .weight(10f),
            contentPadding = PaddingValues(10.dp)
        ) {
                page ->
            PageView(page = pages[page])
        }

        HorizontalPagerIndicator(
            modifier = Modifier.weight(1f),
            pagerState = pagerState,
            activeColor = Color.Green,
            inactiveColor = Color.Black,
            spacing = 2.dp,
            indicatorShape = RoundedCornerShape(10.dp),
            indicatorWidth = 10.dp
        )

        FinishButton(modifier = Modifier.weight(1f)
            , pagerState = pagerState,
            onClick = { onboardingViewModel.SaveOnBoardingState(true)
                navController.popBackStack()
                navController.navigate(Screen.HomeScreen.route)}
        )

    }


}


}
