package com.example.eva1_14_clima;

public class Weather {
    private String City;
    private Double temp;
    private String desc;
    private int imageWeather;

    public Weather() {
    }
    public Weather(String city, Double temp, String desc, int imageWeather) {
        City = city;
        this.temp = temp;
        this.desc = desc;
        this.imageWeather = imageWeather;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageWeather() {
        return imageWeather;
    }

    public void setImageWeather(int imageWeather) {
        this.imageWeather = imageWeather;
    }
}

