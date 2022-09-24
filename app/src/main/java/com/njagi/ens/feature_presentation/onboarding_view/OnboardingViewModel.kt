package com.njagi.ens.feature_presentation.onboarding_view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.njagi.ens.data.DataStoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(private val repository: DataStoreRepository) :
    ViewModel() {
    fun SaveOnBoardingState(completed: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.saveOnboardingState(completed)
        }
    }
}
