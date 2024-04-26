package org.hse.template.client.rest.model.secondary

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

data class Coord(
    val lon: Double,
    val lat: Double
)