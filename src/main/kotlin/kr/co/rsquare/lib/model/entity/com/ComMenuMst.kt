package kr.co.rsquare.lib.model.entity.com

import kr.co.rsquare.lib.model.entity.EntityTail
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_menu_mst")
data class ComMenuMst(
    @Id var menuId: String = "",
    var parentMenuId: String? = null,
    var categoryYn: String = "N",
    var path: String = "",
    var menuDisplayName: String = "",
    var displaySeq: Int = 0,
    var publicYn: String = "N",
    var displayYn: String = "Y",
    var description: String? = null,
    val useYn: String = "Y",
    val tail: EntityTail = EntityTail()
) : Serializable
