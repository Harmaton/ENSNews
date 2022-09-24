package com.njagi.ens.di

import android.content.Context
import com.njagi.ens.data.DataStoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun ProvideDataStoreRepository(@ApplicationContext context: Context) =
        DataStoreRepository(context = context)
}