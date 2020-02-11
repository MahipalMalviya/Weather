package com.weather.mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("2020-02-10")
    @Expose
    private TodayForecast todayForecast;

    public TodayForecast getTodayForecast() {
        return todayForecast;
    }

    public void setTodayForecast(TodayForecast todayForecast) {
        this.todayForecast = todayForecast;
    }
}