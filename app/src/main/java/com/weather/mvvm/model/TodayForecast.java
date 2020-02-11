package com.weather.mvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TodayForecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_epoch")
    @Expose
    private long dateEpoch;
    @SerializedName("astro")
    @Expose
    private Astro astro;
    @SerializedName("mintemp")
    @Expose
    private long mintemp;
    @SerializedName("maxtemp")
    @Expose
    private long maxtemp;
    @SerializedName("avgtemp")
    @Expose
    private long avgtemp;
    @SerializedName("totalsnow")
    @Expose
    private long totalsnow;
    @SerializedName("sunhour")
    @Expose
    private double sunhour;
    @SerializedName("uv_index")
    @Expose
    private long uvIndex;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(long dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public long getMintemp() {
        return mintemp;
    }

    public void setMintemp(long mintemp) {
        this.mintemp = mintemp;
    }

    public long getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(long maxtemp) {
        this.maxtemp = maxtemp;
    }

    public long getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(long avgtemp) {
        this.avgtemp = avgtemp;
    }

    public long getTotalsnow() {
        return totalsnow;
    }

    public void setTotalsnow(long totalsnow) {
        this.totalsnow = totalsnow;
    }

    public double getSunhour() {
        return sunhour;
    }

    public void setSunhour(double sunhour) {
        this.sunhour = sunhour;
    }

    public long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(long uvIndex) {
        this.uvIndex = uvIndex;
    }
}
