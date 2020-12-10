package infrastructure.repositoryimpl

import domain.SjconvOutput
import infrastructure.api.StrangeJapaneseConverter
import interfaces.repository.SjconvRepository

class SjconvRepositoryImpl : SjconvRepository {
    override fun convert(input: String): String
                    = StrangeJapaneseConverter.convert(input)

}