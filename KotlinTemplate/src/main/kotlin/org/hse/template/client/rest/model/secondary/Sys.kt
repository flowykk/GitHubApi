package org.hse.template.client.rest.model.secondary

data class Sys(
    val type: Int,
    val id: Int,
    val country: String?,
    val sunrise: Long,
    val sunset: Long
)