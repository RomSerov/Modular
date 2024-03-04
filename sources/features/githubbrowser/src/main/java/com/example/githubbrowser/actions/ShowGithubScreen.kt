package com.example.githubbrowser.actions

import android.content.Context
import android.content.Intent
import com.example.core.actions.ShowGithubScreenAction
import com.example.githubbrowser.GithubActivity

class ShowGithubScreenActionImpl: ShowGithubScreenAction {
    override fun show(context: Context) {
        context.startActivity(Intent(context, GithubActivity::class.java))
    }
}