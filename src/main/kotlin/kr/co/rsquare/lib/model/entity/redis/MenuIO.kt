package kr.co.rsquare.lib.model.entity.redis

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("menu")
data class MenuIO(
    @Id val menuId: String,
    var menuDisplayName: String,
    var path: String,
    var displaySeq: Int
) : Serializable

