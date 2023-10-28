package com.hyphen.plugins

import com.hyphen.routes.getAllHeroes
import com.hyphen.routes.root
import com.hyphen.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resource("images")
        }
    }
}
