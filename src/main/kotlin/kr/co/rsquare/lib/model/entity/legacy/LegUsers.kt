package kr.co.rsquare.lib.model.entity.legacy

import java.io.Serializable
import java.sql.Date
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class LegUsers(
    @Id val id: Long,
    val name: String,
    val email: String,
    val department: String,
    val userGroup: String,
    val phone: String,
    val mobile: String,
    val birthday: String,
    val createdAt: Date,
    val updatedAt: Date,
    val passwordDigest: String,
    val forgottenCode: String
):Serializable
