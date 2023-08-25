package poc.mongo.manuall.repository

import org.springframework.data.mongodb.repository.MongoRepository
import poc.mongo.manuall.domain.Image

interface ImageRepository: MongoRepository<Image, Int>  {

}