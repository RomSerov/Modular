package com.example.di

import com.example.RealApp
import com.example.core.di.ApplicationProvider
import com.example.core.di.GithubBrowserProvider
import com.example.core.di.MainToolsProvider
import com.example.core.di.RepoProvider
import com.example.githubbrowser.di.GithubComponent
import com.example.githubbrowser.di.export.GithubBrowserExportComponent
import com.example.repo.di.RepoComponent
import com.example.tools.di.MainToolsComponent
import dagger.Component
import javax.inject.Singleton

@Component(
    dependencies = [
        MainToolsProvider::class,
        RepoProvider::class,
        GithubBrowserProvider::class
    ]
)
@Singleton
interface AppComponent: ApplicationProvider {

    fun inject(app: RealApp)

    class Initializer private constructor() {
        companion object {
            fun init(app: RealApp): AppComponent {

                val mainToolsProvider = MainToolsComponent.Initializer
                    .init(app = app)

                val repoProvider = RepoComponent.Initializer
                    .init(mainToolsProvider = mainToolsProvider)

                val githubBrowserProvider = GithubBrowserExportComponent.Initializer
                    .init(mainToolsProvider)

                return DaggerAppComponent.builder()
                    .mainToolsProvider(mainToolsProvider)
                    .repoProvider(repoProvider)
                    .githubBrowserProvider(githubBrowserProvider)
                    .build()
            }
        }
    }
}