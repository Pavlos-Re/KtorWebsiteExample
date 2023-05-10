package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {
        static("/static"){
            resources("files")
    }

    }
}
