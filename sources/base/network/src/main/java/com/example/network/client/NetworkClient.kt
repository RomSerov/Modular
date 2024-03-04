package com.example.network.client

import com.example.core.GithubProject

interface NetworkClient {
    fun requestProject(
        path: String,
        onResult: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    )
}