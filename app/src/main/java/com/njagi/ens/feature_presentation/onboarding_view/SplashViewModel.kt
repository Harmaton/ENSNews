package com.njagi.ens.feature_presentation.onboarding_view

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.njagi.ens.data.DataStoreRepository
import com.njagi.ens.navigation.Screen
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(dataStoreRepository: DataStoreRepository): ViewModel() {
    private val _isloading : MutableState<Boolean> = mutableStateOf(true)
    val isloading: State<Boolean> = _isloading

    private val _startdestination: MutableState<String> = mutableStateOf(Screen.OnboardingScreen.route)
    val startDestination: State<String> = _startdestination

    init {
        viewModelScope.launch {
            dataStoreRepository.readOnboardingState().collect { completed ->
                if(completed){
                    _startdestination.value=Screen.HomeScreen.route
                } else{
                    _startdestination.value=Screen.OnboardingScreen.route
                }
            }
            _isloading.value= false
        }
    }
}