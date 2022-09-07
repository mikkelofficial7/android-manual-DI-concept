package com.example.myapplication

import android.content.Context

interface Injection {
    fun provideBatteryReader(): ClassSomeWork?

    fun createBatteryReader(): ClassSomeWork

    fun provideContext(): Context
}