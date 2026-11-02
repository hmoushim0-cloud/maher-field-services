package sa.factory.maherfieldservices.model

import kotlinx.serialization.Serializable

@Serializable
data class MaherFieldItem(
    val id: String,
    val title: String,
    val description: String,
    val priceSar: String,
    val badge: String = "معتمد"
)

@Serializable
data class MaherFieldOrder(
    val requestId: String,
    val items: List<MaherFieldItem>,
    val status: String = "ACTIVE"
)
