package org.hse.template.client.rest.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "organizations")
class Organization(
    @Id val id: Long,
    val login: String,
    val name: String?,
    val company: String?,
    val repos_url: String,
    val members_url: String,
    val avatar_url: String,
    val location: String?,
    val email: String?,
    val public_repos: Int,
    val followers: Int
)