package com.example.network.di

import com.example.network.client.NetworkClient

interface NetworkProvider {
    fun provideNetworkClient(): NetworkClient
}