package com.example.tools.di

import com.example.core.App
import com.example.core.tools.Logger
import com.example.core.tools.Toaster
import com.example.tools.LoggerImpl
import com.example.tools.ToasterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface ToolsModule {

    companion object {

        @Singleton
        @Provides
        fun provideLogger(): Logger {
            return LoggerImpl()
        }

        @Singleton
        @Provides
        fun provideToaster(app: App): Toaster {
            return ToasterImpl(
                appContext = app.getApplicationContext()
            )
        }
    }
}