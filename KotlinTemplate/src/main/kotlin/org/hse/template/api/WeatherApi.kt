package org.hse.template.api

import io.swagger.v3.oas.annotations.media.Schema
import org.hse.template.client.rest.model.main.ForecastData
import org.hse.template.client.rest.model.main.HistoryData
import org.hse.template.client.rest.model.main.WeatherData

interface WeatherApi {
    fun weather(
        city: String,

        @Schema(defaultValue = "ecb789e2ffeacbe622efd1c35fb29686")
        appid: String
    ): WeatherData

    fun dailyForecast(
        city: String,
        daysNumber: Int,

        @Schema(defaultValue = "ecb789e2ffeacbe622efd1c35fb29686")
        appid: String
    ): ForecastData

    fun forecast(
        city: String,

        @Schema(defaultValue = "ecb789e2ffeacbe622efd1c35fb29686")
        appid: String
    ): ForecastData

    fun historical(
        city: String,

        @Schema(defaultValue = "ecb789e2ffeacbe622efd1c35fb29686")
        appid: String
    ): HistoryData
}