package org.hse.template.repository

import jakarta.persistence.Id
import org.hse.template.client.rest.model.Repository
import org.hse.template.client.rest.model.User
import org.springframework.data.repository.CrudRepository

interface GitHubRepoRepository : CrudRepository<Repository, Long> {
    fun findByOwnerAndName(owner: User, name: String): Repository?
}