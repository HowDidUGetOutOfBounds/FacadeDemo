package com.example.facadesample.di

import com.example.facadesample.external_library_simulation.VeryCoolDeprecatedLibrary
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LibraryModule {

    @Provides
    @Singleton
    fun provideVeryCoolDeprecatedLibrary(): VeryCoolDeprecatedLibrary { // Tight dependency that you already have in project
        return VeryCoolDeprecatedLibrary()
    }
}