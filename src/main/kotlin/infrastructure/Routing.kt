package infrastructure

import domain.SjconvInput
import interfaces.controller.SjconvController
import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Routing.root() {
    val sjconvController: SjconvController by inject()

    post("/api") {
        val param = call.receive<SjconvInput>()

        call.respond(sjconvController.post(param))
    }
}