package com.example.githubbrowser.usecase

import com.example.core.GithubProject

interface GithubUseCase {
    fun loadInfoFromGithub(
        onLoaded: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    )
}