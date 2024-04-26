package org.hse.template.client.rest.api

import org.hse.template.client.rest.model.main.ForecastData
import org.hse.template.client.rest.model.main.HistoryData
import org.hse.template.client.rest.model.main.WeatherData
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "weather", path = "")
interface WeatherClient {
    @GetMapping("weather")
    fun getWeather(
        @RequestParam("q") city: String,
        @RequestParam("appid") appid: String
    ): WeatherData

    @GetMapping("forecast/daily")
    fun getDailyForecast(
        @RequestParam("q") city: String,
        @RequestParam("cnt") daysNumber: Int,
        @RequestParam("appid") appid: String
    ): ForecastData

    @GetMapping("forecast")
    fun getForecast(
        @RequestParam("q") city: String,
        @RequestParam("appid") appid: String
    ): ForecastData

    @GetMapping("history/city")
    fun getHistoricalData(
        @RequestParam("q") city: String,
        @RequestParam("appid") appid: String
    ): HistoryData
}