package com.example.zenithmealplanner

import android.app.Application
import com.example.zenithapplication.di.appModule
import org.koin.core.context.startKoin

class ZenithApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(appModule)
        }
    }
}