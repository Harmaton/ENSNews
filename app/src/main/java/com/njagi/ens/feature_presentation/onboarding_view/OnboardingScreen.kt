package com.njagi.ens.feature_presentation.onboarding_view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.njagi.ens.R
import com.njagi.ens.ui.theme.ENSTheme

@Composable
fun OnboardingScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        val items = ArrayList<OnboardingData>()
        items.add(OnboardingData(R.drawable.ic_launcher_background))
        items.add(OnboardingData(R.drawable.ic_launcher_background))
        items.add(OnboardingData(R.drawable.ic_launcher_background))

    }
}

@Composable
fun OnboardingScreenPreview(){
    ENSTheme {
        OnboardingScreen()
    }
}