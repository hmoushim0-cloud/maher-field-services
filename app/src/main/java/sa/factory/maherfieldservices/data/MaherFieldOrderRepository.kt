package sa.factory.maherfieldservices.data

import sa.factory.maherfieldservices.model.MaherFieldItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MaherFieldOrderRepository {
    private val _catalog = MutableStateFlow(listOf(
        MaherFieldItem("1", "الباقة التنفيذية المعتمدة", "تكامل مباشر مع Mada Contactless EMV L2 NFC + GPS Dispatch", "180 ر.س", "معتمد"),
        MaherFieldItem("2", "خدمة المعالجة الفورية", "أداء أصيل بسرعة 60 إطار في الثانية", "95 ر.س", "فوري"),
        MaherFieldItem("3", "باقة الصيانة والدعم السحابي", "تشفير كامل للبيانات المحلية ومزامنة آمنة", "250 ر.س", "شامل")
    ))
    val catalog: Flow<List<MaherFieldItem>> = _catalog.asStateFlow()
}
