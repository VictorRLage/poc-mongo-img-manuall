package poc.mongo.manuall.service

import org.springframework.data.annotation.Id
import poc.mongo.manuall.domain.Image

interface ImageService {

    fun findAll(): List<Image>;

    fun findImage(id: Int): Image;

    fun addImage(image: Image): Image;

}