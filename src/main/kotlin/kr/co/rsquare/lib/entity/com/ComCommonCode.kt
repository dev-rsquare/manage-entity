package kr.co.rsquare.lib.entity.com

import kr.co.rsquare.lib.entity.EntityTail
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.Table

@Entity
@Table(name = "com_common_code")
@IdClass(ComCommonCodeId::class)
data class ComCommonCode(
    @Id var commonGroupCode: String = "",
    @Id var commonCode: String = "",
    var commonCodeName: String = "",
    var displaySeq: Int = 0,
    var description: String? = null,
    val parentGroupCode: String? = null,
    var parentCode: String? = null,
    var useYn: String = "Y",
    val tail: EntityTail = EntityTail()
) : Serializable
