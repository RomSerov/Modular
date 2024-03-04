package com.example.githubbrowser.di

import com.example.core.di.ActivityScope
import com.example.core.di.ApplicationProvider
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationProvider::class, ]
)
interface GithubComponent {
}