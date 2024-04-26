package org.hse.template.client.rest.api

import org.aspectj.weaver.ast.Or
import org.hse.template.client.rest.model.Organization
import org.hse.template.client.rest.model.Release
import org.hse.template.client.rest.model.Repository
import org.hse.template.client.rest.model.User
import org.hse.template.client.rest.model.main.ForecastData
import org.hse.template.client.rest.model.main.HistoryData
import org.hse.template.client.rest.model.main.WeatherData
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "github", path = "")
interface GitHubClients {
    @GetMapping("users/{username}")
    fun getUser(
        @PathVariable username: String,
    ): User

    @GetMapping("repos/{owner}/{repository}")
    fun getRepository(
        @PathVariable owner: String,
        @PathVariable repository: String,
    ): Repository

    @GetMapping("users/{username}/followers")
    fun getFollowers(
        @PathVariable username: String
    ): List<User>

    @GetMapping("repos/{owner}/{repository}/releases/latest")
    fun getLatestRelease(
        @PathVariable owner: String,
        @PathVariable repository: String
    ): Release

    @GetMapping("orgs/{orgName}")
    fun getOrganization(
        @PathVariable orgName: String
    ): Organization
}