
apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/bintray.gradle")
apply(from = "../gradle/dokka.gradle")
apply(from = "../gradle/testng.gradle")

dependencies {
    "api"(project(":hexagon_core"))
}
