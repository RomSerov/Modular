package com.example.repo

import com.example.core.GithubProject
import com.example.core.repo.GithubRepo
import com.example.core.tools.Logger
import com.example.network.client.NetworkClient
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val client: NetworkClient,
    private val logger: Logger
) : GithubRepo {

    override fun getSampleProject(
        onResult: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        logger.d("requested  project")
        client.requestProject(
            path = "kotlinsg/KWorkshopApp",
            onResult = onResult,
            onError = onError
        )
    }
}