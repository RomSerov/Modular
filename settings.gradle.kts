pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = "Modular"

include(":injector")
project(":injector").projectDir = File(rootDir, "sources/base/injector")

include(":core")
project(":core").projectDir = File(rootDir, "sources/base/core")

include(":githubbrowser")
project(":githubbrowser").projectDir = File(rootDir, "sources/features/githubbrowser")

include(":notifications")
project(":notifications").projectDir = File(rootDir, "sources/features/notifications/notifications-fake")

include(":network")
project(":network").projectDir = File(rootDir, "sources/base/network")
