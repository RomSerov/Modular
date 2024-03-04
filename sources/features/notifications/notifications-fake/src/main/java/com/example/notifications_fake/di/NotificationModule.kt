package com.example.notifications_fake.di

import com.example.core.notification.NotificationUseCase
import com.example.core.tools.Toaster
import dagger.Module
import dagger.Provides

interface NotificationProvider {
    fun provideNotificationUseCase(): NotificationUseCase
}

@Module
class NotificationModule {

    @Provides
    fun providesNotificationUseCase(toaster: Toaster): NotificationUseCase =
        object : NotificationUseCase {
            override fun showMessage() {
                toaster.show("notifications are not implemented")
            }
        }
}