package repositories;

import models.weather.Weather;

public interface WeatherRepository {
void add(Weather weather);
void remove(Weather weather);
Weather getWeatherByCityId(String id);
}
