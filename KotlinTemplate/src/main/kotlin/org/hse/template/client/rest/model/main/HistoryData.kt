package org.hse.template.client.rest.model.main

import org.hse.template.client.rest.model.secondary.ListElement

data class HistoryData(
    val message: String,
    val cod: String,
    val city_id: Int,
    val calctime: Double,
    val cnt: Int,
    val list: List<ListElement>
)
