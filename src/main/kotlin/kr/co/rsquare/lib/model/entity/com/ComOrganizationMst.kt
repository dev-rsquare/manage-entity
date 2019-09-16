package kr.co.rsquare.lib.model.entity.com

import kr.co.rsquare.lib.model.entity.EntityTail
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "com_organization_mst")

data class ComOrganizationMst(
    @Id var organizationId: String,
    var parentOrganizationId: String? = null,
    var organizationName: String,
    var aliasName: String? = null,
    var organizationTypeCode: String? = null,
    val tail: EntityTail = EntityTail()
)
