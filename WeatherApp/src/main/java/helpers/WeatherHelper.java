package helpers;

import models.currentWeatherDataAPI.WeatherResponse;
import models.weather.City;
import models.weather.Weather;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WeatherHelper {
    public Weather generateWeather(String id, WeatherResponse weatherResponse) {
        return new Weather(
                new City(id, weatherResponse.getName()),
                weatherResponse.getClouds().getAll(),
                weatherResponse.getMain().getPressure(),
                weatherResponse.getMain().getTemp(),
                weatherResponse.getWind().getSpeed()
        );
    }
}
