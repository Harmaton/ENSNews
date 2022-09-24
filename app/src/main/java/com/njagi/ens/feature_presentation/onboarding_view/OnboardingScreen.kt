package com.njagi.ens.feature_presentation.onboarding_view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.*
import com.njagi.ens.R
import com.njagi.ens.ui.theme.ENSTheme

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(
 navController: NavController
) {
    val pagerState = rememberPagerState(initialPage = 0)

    val pages = listOf(
        Page.First,
        Page.Second,
        Page.Third
    )

    Column(modifier = Modifier.fillMaxSize()) {

        HorizontalPager(count = 3, state = pagerState, modifier = Modifier
            .fillMaxSize()
            .weight(1f),
            contentPadding = PaddingValues(10.dp)
            ) {
            page ->
            PageView(page = pages[page])
        }

        HorizontalPagerIndicator(pagerState = pagerState,
            activeColor = Color.Green,
            inactiveColor = Color.Black,
            spacing = 2.dp,
            indicatorShape = RoundedCornerShape(10.dp),
            indicatorWidth = 10.dp
        )

       FinishButton(modifier = Modifier, pagerState = pagerState) {

       }

        }


    }

@Preview
@Composable
fun OnboardingScreenPreview() {
    ENSTheme {
        //OnboardingScreen()
    }
}