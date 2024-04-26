package org.hse.template.client.rest.model.secondary

import org.hse.template.client.rest.model.secondary.Clouds
import org.hse.template.client.rest.model.secondary.Weather
import org.hse.template.client.rest.model.secondary.Wind

data class ListElement(
    val main: HistoryMain,
    val wind: Wind,
    val clouds: Clouds,
    val weather: List<Weather>,
    val rain: Rain?,
    val dt: Long
)