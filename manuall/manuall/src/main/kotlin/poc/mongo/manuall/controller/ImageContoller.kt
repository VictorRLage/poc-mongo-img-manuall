package poc.mongo.manuall.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import poc.mongo.manuall.domain.Image
import poc.mongo.manuall.service.ImageService


@RestController
@RequestMapping("/api/image")
class ImageContoller(){

    @Autowired
    lateinit var imageService: ImageService

    @GetMapping("/all")
    fun findAll(): List<Image?>? {
        return imageService.findAll()
    }

    @PostMapping("/find/{id}")
    fun findImage(@PathVariable id: Int): Image? {
        return imageService.findImage(id)
    }

    @PostMapping("/add")
    fun addImage(@RequestBody image: Image?): Image? {
        return imageService.addImage(image!!)
    }


}