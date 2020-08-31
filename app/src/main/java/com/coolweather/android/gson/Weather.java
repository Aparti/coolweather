package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author liuzepeng
 */
public class Weather {

    public String status;

    public Basic basic;

    public NOW now;

    public Suggestion suggestion;

    public AQI aqi;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
