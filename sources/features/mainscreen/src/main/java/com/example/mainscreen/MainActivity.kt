package com.example.mainscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.core.App
import com.example.core.actions.ShowGithubScreenAction
import com.example.core.tools.Logger
import com.example.mainscreen.di.MainActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var log: Logger

    @Inject
    lateinit var showGithubScreenAction: ShowGithubScreenAction

    override fun onCreate(savedInstanceState: Bundle?) {

        MainActivityComponent.Initializer
            .init((applicationContext as App).getAppComponent())
            .inject(this@MainActivity)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.icon).setOnClickListener {
            openGithubScreen()
        }
        log.d("Main activity created. Logger injected successfully")
    }

    private fun openGithubScreen() {
        showGithubScreenAction.show(this)
    }
}