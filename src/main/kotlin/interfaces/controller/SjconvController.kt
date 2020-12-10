package interfaces.controller

import domain.*
import interfaces.repository.SjconvRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class SjconvController : KoinComponent{
    private val sjconvRepository: SjconvRepository by inject()
    fun post(input: SjconvInput) = SjconvOutput(input = input.input, sjconvRepository.convert(input = input.input))
}