plugins {
    java
    application
}

dependencies {
    implementation(group: "org.eclipse.jetty", artifact: "jetty-server", version: "11.0.7")
}

application {
    // Define the main class for the application.
    mainClassName = "ru.cerbe.jsf.naming.bug.App"
}
