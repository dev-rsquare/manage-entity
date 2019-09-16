package kr.co.rsquare.lib.model.entity.com

import java.sql.Date
import javax.persistence.Id

data class ComTermMst(
    @Id var termId: String? = null,
    var meaningHan: String? = null,
    var meaningEng: String? = null,
    var acronym: String? = null,
    var useYn: String? = null,
    var createUserId: String? = null,
    var createDate: Date,
    var updateUserId: String? = null,
    var updateDate: Date? = null
)
