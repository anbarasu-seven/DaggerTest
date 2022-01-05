package com.example.daggertest.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SharedPreferencesModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideSharedPreference(context: Context) = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
}