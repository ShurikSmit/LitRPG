package com.company.engine.City;

public class CreateCity {
    private String CityName = "NoName City";
    public String getCityName() {
        return CityName;
    }
    public void setCityName(String cityName) {
        CityName = cityName;
    }
    public String helloCity(){
        String text= "Вы вошли в город"+ getCityName();
        return text;
    }
}
