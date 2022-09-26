package com.njagi.ens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.njagi.ens.feature_presentation.onboarding_view.SplashViewModel
import com.njagi.ens.navigation.NavGraph
import com.njagi.ens.ui.theme.ENSTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition(){
            !splashViewModel.isloading.value
        }

        setContent {
            ENSTheme {
                   val screen by splashViewModel.startDestination
                   val navcontroller = rememberNavController()
                    NavGraph(navController = navcontroller, startdestination = screen)


            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ENSTheme {

    }
}