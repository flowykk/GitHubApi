package org.hse.template.client.rest.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "releases")
data class Release(
    @Id val id: Long,
    val upload_url: String,
    val html_url: String,
    @OneToOne val author: User,
    val tag_name: String,
    val name: String,
    val published_at: String,
)