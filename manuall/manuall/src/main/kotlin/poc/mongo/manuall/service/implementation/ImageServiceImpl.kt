package poc.mongo.manuall.service.implementation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.stereotype.Service
import poc.mongo.manuall.domain.Image
import poc.mongo.manuall.repository.ImageRepository
import poc.mongo.manuall.service.ImageService

@Service
class ImageServiceImpl: ImageService{

    @Autowired
    lateinit var imageRepository: ImageRepository

    override fun findAll(): List<Image> {
        return imageRepository.findAll()
    }

    override fun findImage(id: Int): Image {
        return imageRepository.findById(id).get()
    }

    override fun addImage(image: Image): Image {
        return imageRepository.save(image)
    }
}