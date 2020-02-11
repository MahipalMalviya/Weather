package com.weather.network

import com.weather.mvvm.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("forecast?access_key=f3431454ea867d1fb2bd6b019c1aa671&query=Pune&forecast_days = 14")
    fun fetchWeatherForecast(): Call<WeatherResponse>
}