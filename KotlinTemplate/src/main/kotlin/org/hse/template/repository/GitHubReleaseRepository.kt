package org.hse.template.repository

import org.hse.template.client.rest.model.Release
import org.hse.template.client.rest.model.Repository
import org.hse.template.client.rest.model.User
import org.springframework.data.repository.CrudRepository

interface GitHubReleaseRepository : CrudRepository<Release, Long> {
    fun findByAuthor(author: User): Release?
}