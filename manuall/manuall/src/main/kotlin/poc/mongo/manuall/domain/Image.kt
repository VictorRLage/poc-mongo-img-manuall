package poc.mongo.manuall.domain

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "images")

class Image(
    @Id
    val id: Int,
    val base64: String,
) {
}