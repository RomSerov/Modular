package com.example.notifications_fake.di

import com.example.core.di.MainToolsProvider
import dagger.Component

@Component(
    dependencies = [MainToolsProvider::class],
    modules = [NotificationModule::class]
)
interface NotificationComponent: NotificationProvider {

    class Initializer private constructor() {

        companion object {

            fun init(mainToolsProvider: MainToolsProvider): NotificationProvider =
                DaggerNotificationComponent.builder()
                    .mainToolsProvider(mainToolsProvider)
                    .build()
        }
    }
}