rootProject.name = "dm-plugin"
includeBuild("../../tools") {
    dependencySubstitution {
        substitute(module("com.monkeydp:tools")).with(project(":"))
    }
}