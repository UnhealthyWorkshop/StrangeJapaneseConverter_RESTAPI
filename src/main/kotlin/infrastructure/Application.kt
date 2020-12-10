package infrastructure

import com.fasterxml.jackson.databind.SerializationFeature
import infrastructure.framework.koinModules
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.jackson.*
import io.ktor.routing.*
import org.koin.ktor.ext.Koin

@Suppress("unused")
fun Application.module() {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    install(Koin) {
        modules(koinModules)
    }

    routing {
        root()
    }
}