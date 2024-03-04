package com.example

import android.app.Application
import com.example.core.App
import com.example.core.di.ApplicationProvider
import com.example.core.tools.Toaster
import com.example.di.AppComponent
import javax.inject.Inject

class RealApp: Application(), App {

    @Inject
    lateinit var toaster: Toaster

    val appComponent: AppComponent by lazy {
        AppComponent.Initializer.init(this@RealApp)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(app = this)
        toaster.show("app injected")
    }

    override fun getAppComponent(): ApplicationProvider = appComponent
}