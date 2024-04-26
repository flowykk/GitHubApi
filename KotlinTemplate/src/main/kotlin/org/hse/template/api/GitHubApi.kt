package org.hse.template.api

import org.hse.template.client.rest.model.Organization
import org.hse.template.client.rest.model.Release
import org.hse.template.client.rest.model.Repository
import org.hse.template.client.rest.model.User

interface GitHubApi {
    fun user(
        username: String
    ): User

    fun repository(
        owner: String,
        repository: String
    ): Repository

    fun latestRelease(
        owner: String,
        repository: String
    ): Release

    fun organization(
        orgName: String
    ): Organization

    fun followers(
        username: String,
    ): List<User>
}