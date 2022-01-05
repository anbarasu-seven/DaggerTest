package com.example.daggertest

import android.app.Application
import com.example.daggertest.modules.ApiModule
import com.example.daggertest.modules.AppModule
import com.example.daggertest.modules.SharedPreferencesModule

class MyApp : Application() {

    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .apiModule(ApiModule("url"))
            .sharedPreferencesModule(SharedPreferencesModule(this))
            .build()
    }

    fun getComponent() = appComponent

}