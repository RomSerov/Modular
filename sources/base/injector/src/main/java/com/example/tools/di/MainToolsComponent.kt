package com.example.tools.di

import com.example.core.App
import com.example.core.di.MainToolsProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ToolsModule::class]
)
interface MainToolsComponent: MainToolsProvider {

    @Component.Builder
    interface MainToolsComponentBuilder {

        @BindsInstance
        fun app(app: App): MainToolsComponentBuilder

        fun build(): MainToolsComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(app: App): MainToolsProvider {
                return DaggerMainToolsComponent.builder()
                    .app(app)
                    .build()
            }
        }
    }
}