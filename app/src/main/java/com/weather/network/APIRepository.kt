package com.weather.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIRepository {

    private const val BASE_URL = "http://api.weatherstack.com/"
    private var retrofit: Retrofit? = null

    fun getInstance() : APIService? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit?.create(APIService::class.java)
    }
}