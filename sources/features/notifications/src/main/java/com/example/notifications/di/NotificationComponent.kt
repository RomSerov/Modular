package com.example.notifications.di

import com.example.core.di.MainToolsProvider
import dagger.Component

@Component(
    dependencies = [MainToolsProvider::class],
    modules = [NotificationModule::class]
)
interface NotificationComponent: NotificaitonProvider