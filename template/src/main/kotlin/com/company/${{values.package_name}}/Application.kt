package com.company.${{values.package_name}}

import com.company.${{values.package_name}}.plugins.configureHTTP
import com.company.${{values.package_name}}.plugins.configureMonitoring
import com.company.${{values.package_name}}.plugins.configureRouting
import com.company.${{values.package_name}}.plugins.configureSecurity
import com.company.${{values.package_name}}.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureHTTP()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
