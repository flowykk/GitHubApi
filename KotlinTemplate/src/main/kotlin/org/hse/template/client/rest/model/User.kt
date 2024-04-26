package org.hse.template.client.rest.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Generated

@Entity
@Table(name = "users")
data class User(
    @Id val id: Long,
    val login: String,
    //val name: String?,
    //val company: String?,
    val avatar_url: String,
    val html_url: String,
    val repos_url: String,
    val gists_url: String,
    val followers_url: String,
    val following_url: String
)