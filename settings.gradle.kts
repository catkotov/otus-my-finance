rootProject.name = "otus-my-finance"
include("m1l1-greeting")

pluginManagement {
    val kotlinVersion : String by settings

    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}
