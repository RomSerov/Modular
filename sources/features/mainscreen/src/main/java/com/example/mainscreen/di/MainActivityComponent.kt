package com.example.mainscreen.di

import com.example.core.di.ApplicationProvider
import com.example.mainscreen.MainActivity
import dagger.Component

@Component(
    dependencies = [ApplicationProvider::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    class Initializer private constructor() {
        companion object {
            fun init(appComponent: ApplicationProvider): MainActivityComponent {
                return DaggerMainActivityComponent.builder()
                    .applicationProvider(appComponent).build()
            }
        }
    }
}