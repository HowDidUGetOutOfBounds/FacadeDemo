package com.example.facadesample.di

import com.example.facadesample.contracts.LibraryContract
import com.example.facadesample.contracts.NewLogger
import com.example.facadesample.contracts.OldLogger
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
    fun provideVeryCoolDeprecatedLibrary(): LibraryContract { // Now we can pass any object that implements LibraryContact
        return NewLogger()
    }
}