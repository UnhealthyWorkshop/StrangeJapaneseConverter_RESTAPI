package infrastructure.framework

import infrastructure.repositoryimpl.SjconvRepositoryImpl
import interfaces.controller.SjconvController
import interfaces.repository.SjconvRepository
import org.koin.dsl.module

val koinModules = module {
    single { SjconvController() }
    factory<SjconvRepository>{ SjconvRepositoryImpl() }
}