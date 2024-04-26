package org.hse.template.controller

import org.hse.template.api.WeatherApi
import org.hse.template.client.rest.api.WeatherClient
import org.hse.template.client.rest.api.GitHubClients
import org.hse.template.client.rest.model.main.ForecastData
import org.hse.template.client.rest.model.main.HistoryData
import org.hse.template.client.rest.model.main.WeatherData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WeatherController(
    private val catFactsClient: WeatherClient,
    private val gitHubClient: GitHubClients
) : WeatherApi {
    @GetMapping("weather")
    override fun weather(@RequestParam("q") city: String, @RequestParam("appid") appid: String): WeatherData {
        return catFactsClient.getWeather(city, appid)
    }

    @GetMapping("forecast")
    override fun forecast(
        @RequestParam("q") city: String,
        @RequestParam("appid") appid: String): ForecastData {
        return catFactsClient.getForecast(city, appid)
    }

    @GetMapping("forecast/daily")
    override fun dailyForecast(
        @RequestParam("q") city: String,
        @RequestParam("cnt") daysNumber: Int,
        @RequestParam("appid") appid: String): ForecastData {
        return catFactsClient.getDailyForecast(city, daysNumber, appid)
    }

    @GetMapping("historical")
    override fun historical(@RequestParam("q") city: String, @RequestParam("appid") appid: String): HistoryData {
        return catFactsClient.getHistoricalData(city, appid)
    }
}