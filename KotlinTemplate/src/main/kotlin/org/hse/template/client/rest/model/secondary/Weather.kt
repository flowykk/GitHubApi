package org.hse.template.client.rest.model.secondary

data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)