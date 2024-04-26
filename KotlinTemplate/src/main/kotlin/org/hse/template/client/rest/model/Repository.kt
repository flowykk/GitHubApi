package org.hse.template.client.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import org.hibernate.annotations.Generated

@Entity
@Table(name = "repositories")
data class Repository(
    @Id val id: Long,
    val name: String,
    @Column(name = "full_name") val fullname: String?,
    @OneToOne val owner: User,
    val contributors_url: String,
)