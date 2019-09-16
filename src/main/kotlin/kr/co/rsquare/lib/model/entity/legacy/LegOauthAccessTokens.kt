package kr.co.rsquare.lib.model.entity.legacy

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "oauth_access_tokens")
data class LegOauthAccessTokens(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val resourceOwnerId: Long,
    val applicationId: Long,
    val token: String,
    val refresh_token: String? = null,
    val expiresIn: Long,
    val scopes: String = "public",
    val createdAt: Date? = null, // db default current_timestamp
    val revokedAt: Date? = null
)
