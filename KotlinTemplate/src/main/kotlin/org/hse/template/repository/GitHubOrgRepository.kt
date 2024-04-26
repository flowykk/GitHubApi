package org.hse.template.repository

import org.hse.template.client.rest.model.Organization
import org.hse.template.client.rest.model.User
import org.springframework.data.repository.CrudRepository

interface GitHubOrgRepository: CrudRepository<Organization, Long> {
    fun findByLogin(login: String): Organization?
}