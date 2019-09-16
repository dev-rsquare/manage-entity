package kr.co.rsquare.lib.model.entity.com

import kr.co.rsquare.lib.model.entity.EntityTail
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_role_mst")
data class ComRoleMst(
    @Id var roleId: String = "",
    var roleName: String = "",
    var description: String? = null,
    var tail: EntityTail = EntityTail()
): Serializable
