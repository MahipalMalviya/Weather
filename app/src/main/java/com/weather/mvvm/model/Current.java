package com.weather.mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Current {

    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("temperature")
    @Expose
    private long temperature;
    @SerializedName("weather_code")
    @Expose
    private long weatherCode;
    @SerializedName("weather_icons")
    @Expose
    private List<String> weatherIcons = null;
    @SerializedName("weather_descriptions")
    @Expose
    private List<String> weatherDescriptions = null;
    @SerializedName("wind_speed")
    @Expose
    private long windSpeed;
    @SerializedName("wind_degree")
    @Expose
    private long windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure")
    @Expose
    private long pressure;
    @SerializedName("precip")
    @Expose
    private long precip;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("cloudcover")
    @Expose
    private long cloudcover;
    @SerializedName("feelslike")
    @Expose
    private long feelslike;
    @SerializedName("uv_index")
    @Expose
    private long uvIndex;
    @SerializedName("visibility")
    @Expose
    private long visibility;
    @SerializedName("is_day")
    @Expose
    private String isDay;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public long getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(long weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public long getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(long windSpeed) {
        this.windSpeed = windSpeed;
    }

    public long getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(long windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public long getPrecip() {
        return precip;
    }

    public void setPrecip(long precip) {
        this.precip = precip;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public long getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(long cloudcover) {
        this.cloudcover = cloudcover;
    }

    public long getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(long feelslike) {
        this.feelslike = feelslike;
    }

    public long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(long uvIndex) {
        this.uvIndex = uvIndex;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

}