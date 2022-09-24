package com.njagi.ens.feature_presentation.onboarding_view


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.google.accompanist.pager.*


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(
 navController: NavController,
 onboardingViewModel : OnboardingViewModel = viewModel()
) {
    val pagerState = rememberPagerState(initialPage = 0)

    val pages = listOf(
        Page.First,
        Page.Second,
        Page.Third
    )

    Column(modifier = Modifier.fillMaxSize()) {

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
           , pagerState = pagerState) {
           onboardingViewModel.SaveOnBoardingState(true)
           navController.popBackStack()
           navController.navigate(route = "home")

       }

        }


    }
