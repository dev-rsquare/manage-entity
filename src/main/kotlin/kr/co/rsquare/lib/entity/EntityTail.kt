package kr.co.rsquare.lib.entity

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
data class EntityTail(
    @Column(length = 10) var createUserId: String? = null,
    @Column var createDate: Date? = null,
    @Column(length = 10) var updateUserId: String? = null,
    @Column var updateDate: Date? = null
) : Serializable
