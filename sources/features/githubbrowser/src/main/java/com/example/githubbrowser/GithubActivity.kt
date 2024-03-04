package com.example.githubbrowser

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.core.App
import com.example.core.GithubProject
import com.example.core.notification.NotificationUseCase
import com.example.core.tools.Toaster
import com.example.githubbrowser.di.GithubComponent
import com.example.githubbrowser.usecase.GithubUseCase
import javax.inject.Inject

class GithubActivity : AppCompatActivity() {

    @Inject
    lateinit var toaster: Toaster

    @Inject
    lateinit var useCase: GithubUseCase

    @Inject
    lateinit var notifications: NotificationUseCase

    private lateinit var refreshButton: Button
    private lateinit var starsCountText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        GithubComponent.Initializer
            .init(applicationProvider = (applicationContext as App).getAppComponent())
            .inject(activity = this@GithubActivity)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        refreshButton = findViewById(R.id.stars_refresh)
        starsCountText = findViewById(R.id.stars_count_text)

        refreshButton.setOnClickListener {
            useCase.loadInfoFromGithub(
                onLoaded = ::updateUI,
                onError = ::updateErrorUI
            )
        }

        notifications.showMessage()
    }

    private fun updateErrorUI(error: Throwable) {
        toaster.show(error.message ?: "unable to load")
    }

    private fun updateUI(result: GithubProject) {
        starsCountText.text = "${result.name} stars count: ${result.stargazers_count}"
    }
}