package kr.co.rsquare.lib.model.entity.legacy

import java.io.Serializable
import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "oauth_applications")
data class LegOauthApplications(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val uid: String,
    val secret: String,
    val redirectUri: String,
    val ownerId: String? = null,
    val ownerType: String? = null,
    val scopes: String? = null,
    val createdAt: Date? = null, // db default current_timestamp
    val updatedAt: Date? = null
):Serializable
