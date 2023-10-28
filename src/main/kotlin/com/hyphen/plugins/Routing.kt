package com.hyphen.plugins

import com.hyphen.routes.root
import io.ktor.application.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
    }
}
