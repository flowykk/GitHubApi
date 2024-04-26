package org.hse.template.repository

import org.hse.template.client.rest.model.User
import org.springframework.data.repository.CrudRepository

interface GitHubUserRepository: CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}