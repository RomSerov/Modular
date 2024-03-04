package com.example.core.di

import com.example.core.App
import com.example.core.actions.ShowGithubScreenAction
import com.example.core.repo.GithubRepo
import com.example.core.tools.Logger
import com.example.core.tools.Toaster

interface ApplicationProvider : MainToolsProvider, GithubBrowserProvider, RepoProvider

interface MainToolsProvider {
    fun provideContext(): App
    fun provideLogger(): Logger
    fun provideToast(): Toaster
}

interface GithubBrowserProvider {
    fun provideShowGithubScreenAction(): ShowGithubScreenAction
}

interface RepoProvider {
    fun provideGithubRepo(): GithubRepo
}