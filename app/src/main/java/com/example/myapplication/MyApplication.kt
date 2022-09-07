package com.example.myapplication

import android.app.Application

class MyApplication : Application() {
    private var injection = createInjection()

    fun createInjection(): Injection {
        return InjectionImpl(this)
    }

    fun getInjection(): Injection {
        return injection
    }
}