package services;

import models.weather.Weather;

public interface WeatherService {
    Weather getWeather(String id);
}
