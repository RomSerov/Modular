package com.example.network.di

import com.example.network.client.NetworkClient
import com.example.network.client.NetworkClientImpl
import dagger.Binds
import dagger.Module

@Module
interface NetworkModule {

    @Binds
    fun bindNetworkClient(impl: NetworkClientImpl): NetworkClient
}