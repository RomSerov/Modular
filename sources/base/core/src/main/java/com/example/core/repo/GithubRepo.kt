package com.example.core.repo

import com.example.core.GithubProject

interface GithubRepo {
    fun getSampleProject(
        onResult: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    )
}