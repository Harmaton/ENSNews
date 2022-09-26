package com.njagi.ens.feature_presentation.onboarding_view

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.njagi.ens.data.DataStoreRepository
import com.njagi.ens.navigation.Graph
import com.njagi.ens.navigation.Screen
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(dataStoreRepository: DataStoreRepository): ViewModel() {
    private val _isloading : MutableState<Boolean> = mutableStateOf(true)
    val isloading: State<Boolean> = _isloading

    private val _startdestination: MutableState<String> = mutableStateOf(Graph.ONBOARDINGNAV_ROUTE)
    val startDestination: State<String> = _startdestination

    init {
        viewModelScope.launch {
            dataStoreRepository.readOnboardingState().collect { completed ->
                if(completed){

                    // go to bottom bar navigation
                    _startdestination.value=Graph.HOMENAV_ROUTE
                } else{
                    _startdestination.value=Graph.ONBOARDINGNAV_ROUTE
                }
            }
            _isloading.value= false
        }
    }
}