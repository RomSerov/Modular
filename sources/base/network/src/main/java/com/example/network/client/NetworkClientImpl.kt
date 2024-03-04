package com.example.network.client

import com.example.core.GithubProject
import com.example.core.tools.Logger
import com.example.network.model.GithubProjectModel
import com.github.kittinunf.fuel.httpGet
import javax.inject.Inject

class NetworkClientImpl @Inject constructor(
    private val logger: Logger
): NetworkClient {

    override fun requestProject(
        path: String,
        onResult: (GithubProject) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        val url = "https://api.github.com/repos/$path"

        logger.d("requesting: $url")

        url.httpGet().responseObject(
            deserializer = GithubProjectModel.Deserializer(),
            handler =
        )
    }
}