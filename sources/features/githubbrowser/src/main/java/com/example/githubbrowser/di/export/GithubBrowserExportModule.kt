package com.example.githubbrowser.di.export

import com.example.core.actions.ShowGithubScreenAction
import com.example.githubbrowser.actions.ShowGithubScreenActionImpl
import dagger.Module
import dagger.Provides

@Module
class GithubBrowserExportModule {

    @Provides
    fun provideShowGithubAction(): ShowGithubScreenAction {
        return ShowGithubScreenActionImpl()
    }
}