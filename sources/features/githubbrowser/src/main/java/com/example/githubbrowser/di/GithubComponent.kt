package com.example.githubbrowser.di

import com.example.core.di.ActivityScope
import com.example.core.di.ApplicationProvider
import com.example.githubbrowser.GithubActivity
import com.example.notifications_fake.di.NotificationComponent
import com.example.notifications_fake.di.NotificationProvider
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationProvider::class, NotificationProvider::class],
    modules = [GithubModule::class]
)
interface GithubComponent {

    fun inject(activity: GithubActivity)

    class Initializer private constructor() {
        companion object {
            fun init(applicationProvider: ApplicationProvider): GithubComponent {

                val notificationProvider = NotificationComponent.Initializer
                    .init(applicationProvider)

                return DaggerGithubComponent.builder()
                    .applicationProvider(applicationProvider)
                    .notificationProvider(notificationProvider)
                    .build()
            }
        }
    }
}