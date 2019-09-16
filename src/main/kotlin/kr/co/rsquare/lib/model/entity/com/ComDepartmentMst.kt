package kr.co.rsquare.lib.model.entity.com

import kr.co.rsquare.lib.model.entity.EntityTail
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_department_mst")
data class ComDepartmentMst(
    @Id var departmentId: String,
    var departmentName: String = "",
    var parentDepartmentId: String? = null,
    var organizationId: String? = null,
    var useYn: String,
    val tail: EntityTail = EntityTail()
    )
