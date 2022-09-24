package com.njagi.ens.feature_presentation.onboarding_view

import androidx.annotation.DrawableRes
import com.njagi.ens.R

sealed class Page(
    val title: String,
    val description: String,
    @DrawableRes
    val image: Int
) {

    object First : Page(
        "Your Source of Truth",
        "Discover developing news from all over the World",
        R.drawable.ic_launcher_background
    )
    object Second:  Page(
            "Curated News",
            "We bring to you categorised smart recommendations ",
            R.drawable.ic_launcher_foreground
        )
     object Third: Page(
            "You get to be the first person to see",
            "Explore Over 1M+ news daily",
            R.drawable.ic_launcher_foreground
        )
}
