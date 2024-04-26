package org.hse.template.client.rest.model.secondary

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hse.template.client.rest.model.secondary.Coord
import org.springframework.boot.autoconfigure.domain.EntityScan


public class City(
    val id: Long,
//    @JsonProperty("id")
//    val city_id: Int,
    val name: String,
    val coord: Coord,
    val country: String?,
    val population: Int,
    val timezone: Int,
    val sunrise: Long,
    val sunset: Long
)