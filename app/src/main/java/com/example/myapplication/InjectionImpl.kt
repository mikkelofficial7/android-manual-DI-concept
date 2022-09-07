package com.example.myapplication

import android.content.Context

class InjectionImpl(private val context: Context) : Injection {
    private var classAction: ClassSomeWork? = null

    override fun provideBatteryReader(): ClassSomeWork? {
        if (classAction == null) {
            classAction = createBatteryReader()
        }
        return classAction
    }

    override fun createBatteryReader(): ClassSomeWork {
        return ClassSomeWork(provideContext())
    }

    /***** Public provide methods  */
    override fun provideContext(): Context {
        return context
    }
}