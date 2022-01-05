package com.example.daggertest

import android.content.SharedPreferences
import com.example.daggertest.modules.ApiModule
import com.example.daggertest.modules.AppModule
import com.example.daggertest.modules.SharedPreferencesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class, SharedPreferencesModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}