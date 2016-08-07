package com.example.weather;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/2.
 */
public class WeatherInfo implements Serializable {
    String date;
    String nongli;
    String week;

    public WeatherInfo() {
    }

    public WeatherInfo(String date, String nongli, String week) {
        this.date = date;
        this.nongli = nongli;
        this.week = week;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNongli(String nongli) {
        this.nongli = nongli;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public String getNongli() {
        return nongli;
    }

    public String getWeek() {
        return week;
    }
}
