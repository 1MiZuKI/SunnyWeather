package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        // 彩云天气TOKEN
        const val TOKEN = "ebP1l6gn2q7sjBav"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}