package org.hse.template.controller

import org.hse.template.api.GitHubApi
import org.hse.template.client.rest.api.GitHubClients
import org.hse.template.client.rest.model.Organization
import org.hse.template.client.rest.model.Release
import org.hse.template.client.rest.model.Repository
import org.hse.template.client.rest.model.User
import org.hse.template.repository.GitHubOrgRepository
import org.hse.template.repository.GitHubReleaseRepository
import org.hse.template.repository.GitHubRepoRepository
import org.hse.template.repository.GitHubUserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GitHubController(
    private val gitHubClient: GitHubClients,
    private val gitHubUserRepository: GitHubUserRepository,
    private val gitHubRepoRepository: GitHubRepoRepository,
    private val gitHubReleaseRepository: GitHubReleaseRepository,
    private val gitHubOrgRepository: GitHubOrgRepository
) : GitHubApi {
    @GetMapping("user")
    override fun user(
        @RequestParam("username") username: String
    ): User {
        val user: User = gitHubUserRepository.findByLogin(username)
            ?: gitHubClient.getUser(username).also { user -> gitHubUserRepository.save(user) }

        return user
    }

    @GetMapping("repository")
    override fun repository(
        @RequestParam("ownerLogin") owner: String,
        @RequestParam("repositoryName") repository: String
    ): Repository {
        val user = user(owner)

        val repo: Repository = gitHubRepoRepository.findByOwnerAndName(user, repository)
            ?: gitHubClient.getRepository(user.login, repository).also { repo -> gitHubRepoRepository.save(repo) }

        return repo
    }

    @GetMapping("latest-release")
    override fun latestRelease(
        @RequestParam("ownerLogin") owner: String,
        @RequestParam("repositoryName") repository: String,
    ): Release {
        val user = user(owner)
        val repo = repository(owner, repository)

        val release = gitHubReleaseRepository.findByAuthor(user)
            ?: gitHubClient.getLatestRelease(user.login, repo.name).also { release -> gitHubReleaseRepository.save(release) }

        return release
    }

    @GetMapping("organization")
    override fun organization(
        @RequestParam("organizationName") orgName: String
    ): Organization {
        val org: Organization = gitHubOrgRepository.findByLogin(orgName)
            ?: gitHubClient.getOrganization(orgName).also { org -> gitHubOrgRepository.save(org) }

        return org
    }

    @GetMapping("followers")
    override fun followers(
        @RequestParam("username") username: String,
    ): List<User> {
        val followers = gitHubClient.getFollowers(username)
        return followers
    }
}