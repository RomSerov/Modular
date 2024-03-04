package com.example.notifications.di

import com.example.core.notification.NotificationUseCase
import com.example.notifications.usecase.NotificationUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
interface NotificationModule {

    @Binds
    fun bindsNotificationUseCase(impl: NotificationUseCaseImpl): NotificationUseCase
}