package com.company.${{values.package_name}}.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello from ${{values.component_id}}!")
        }
        post("/double-receive") {
            val first = call.receiveText()
            val theSame = call.receiveText()
            // TODO: use interpolation
            call.respondText(first + " " + theSame)
        }
    }
}
