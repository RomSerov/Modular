package com.example.githubbrowser.di.export

import com.example.core.di.GithubBrowserProvider
import com.example.core.di.MainToolsProvider
import dagger.Component

@Component(
    dependencies = [MainToolsProvider::class],
    modules = [GithubBrowserExportModule::class]
)
interface GithubBrowserExportComponent: GithubBrowserProvider {

    class Initializer private constructor() {
        companion object {
            fun init(mainToolsProvider: MainToolsProvider): GithubBrowserProvider {
                return DaggerGithubBrowserExportComponent.builder()
                    .mainToolsProvider(mainToolsProvider)
                    .build()
            }
        }
    }
}