package com.example.githubbrowser.di

import com.example.core.di.ActivityScope
import com.example.githubbrowser.usecase.GithubUseCase
import com.example.githubbrowser.usecase.GithubUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
interface GithubModule {

    @ActivityScope
    @Binds
    fun bindGithubUseCase(impl: GithubUseCaseImpl): GithubUseCase
}