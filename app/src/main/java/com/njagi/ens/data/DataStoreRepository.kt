package com.njagi.ens.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "on_boarding_pref")


class DataStoreRepository (context: Context) {

    private object PreferencesKey{
        val onBoardingKey = booleanPreferencesKey(name = "on_boarding_completed")
    }


    private val dataStore = context.dataStore

    suspend fun saveOnboardingState(completed : Boolean){
        dataStore.edit { preferences ->
            preferences[PreferencesKey.onBoardingKey] = completed
        }
    }

    fun readOnboardingState(): kotlinx.coroutines.flow.Flow<Boolean>{
        return dataStore.data
            .catch { exception ->
                if (exception is IOException){
                    emit(emptyPreferences())
                } else{
                    throw exception
                }
            }
            .map {  preferences ->
                val onBoardingState = preferences[PreferencesKey.onBoardingKey] ?: false
                onBoardingState
            }

    }
}