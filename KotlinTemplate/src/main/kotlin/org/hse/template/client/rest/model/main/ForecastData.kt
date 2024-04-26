package org.hse.template.client.rest.model.main

import org.hse.template.client.rest.model.secondary.City
import org.hse.template.client.rest.model.secondary.ForecastItem

data class ForecastData(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val list: List<ForecastItem>,
    val city: City
)