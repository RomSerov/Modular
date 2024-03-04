package com.example.repo.di

import com.example.core.repo.GithubRepo
import com.example.repo.GithubRepoImpl
import dagger.Binds
import dagger.Module

@Module
interface RepoModule {

    @Binds
    fun bindMainRepo(impl: GithubRepoImpl): GithubRepo
}