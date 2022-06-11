package ru.milinsky

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.milinsky.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSockets()
        configureSerialization()
    }.start(wait = true)
}
