package com.example.network.di

import com.example.core.di.MainToolsProvider
import dagger.Component

@Component(
    dependencies = [MainToolsProvider::class],
    modules = [NetworkModule::class]
)
interface NetworkComponent: NetworkProvider