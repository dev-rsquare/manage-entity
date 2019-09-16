package kr.co.rsquare.lib.repo.legacy

import kr.co.rsquare.lib.model.entity.legacy.LegUsers
import org.springframework.data.repository.CrudRepository

interface LegUsersRepo: CrudRepository<LegUsers, Long> {
    fun findByEmail(email: String) : LegUsers?
}
