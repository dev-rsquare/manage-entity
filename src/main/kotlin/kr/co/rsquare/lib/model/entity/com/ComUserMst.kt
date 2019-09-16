package kr.co.rsquare.lib.model.entity.com

import kr.co.rsquare.lib.model.entity.EntityTail
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_user_mst")
data class ComUserMst(
        @Id var userId: String,
        var emailAddress: String,
        var userName: String = "",
        var nickName: String = "",
        var userTypeCode: String = "",
        var userStatusCode: String = "",
        var organizationId: String? = null,
        var departmentId: String? = null,
        var asisDepartmentName: String? = null,
        val asisGroupName: String? = null,
        val password: String?= null,
        val useYn: String?=null,
        val tail: EntityTail = EntityTail()
)
