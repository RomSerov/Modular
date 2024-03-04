package com.example.githubbrowser.usecase

import com.example.core.GithubProject
import com.example.core.repo.GithubRepo
import javax.inject.Inject

class GithubUseCaseImpl @Inject constructor(
    private val repo: GithubRepo
): GithubUseCase {

    override fun loadInfoFromGithub(
        onLoaded: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        repo.getSampleProject(
            onResult = onLoaded,
            onError = onError
        )
    }
}