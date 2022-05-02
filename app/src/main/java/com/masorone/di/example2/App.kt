package com.masorone.di.example2

import android.app.Application
import com.masorone.di.example2.di.DaggerAppComponent

class App : Application() {

    val appComponent by lazy {
        DaggerAppComponent.factory()
            .create(System.currentTimeMillis(), this)
    }
}