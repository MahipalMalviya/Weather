package com.weather.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weather.mvvm.model.WeatherResponse
import com.weather.network.APIRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherViewModel: ViewModel() {

    private var liveData = MutableLiveData<WeatherResponse>()

    init {
       getAPIWeatherDetails()
    }

    private fun getAPIWeatherDetails() {
        val api = APIRepository.getInstance()
        api?.fetchWeatherForecast()?.enqueue(object : Callback<WeatherResponse> {
            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                liveData.value = response.body()
            }

        })
    }

    fun getMutableLiveData(): LiveData<WeatherResponse> {
        return liveData
    }
}