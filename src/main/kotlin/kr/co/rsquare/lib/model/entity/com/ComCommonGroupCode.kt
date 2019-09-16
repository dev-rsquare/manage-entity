package kr.co.rsquare.lib.model.entity.com

import com.fasterxml.jackson.annotation.JsonInclude
import kr.co.rsquare.lib.model.entity.EntityTail
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_common_group_code")
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ComCommonGroupCode(
    @Id var commonGroupCode: String = "",
    var commonGroupCodeName: String = "",
    val parentGroupCode: String? = null,
    var codeMaxLength: Int = 0,
    var description: String? = null,
    var useYn: String = "Y",
    val tail: EntityTail = EntityTail()
)
