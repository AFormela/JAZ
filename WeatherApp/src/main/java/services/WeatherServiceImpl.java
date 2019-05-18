package services;

import helpers.WeatherHelper;
import models.currentWeatherDataAPI.WeatherResponse;
import models.weather.Weather;
import repositories.WeatherRepository;
import rest.WeatherApi;
import validators.WeatherValidator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class WeatherServiceImpl implements WeatherService {

    @Inject
    private WeatherRepository weatherRepository;
    @Inject
    private WeatherValidator weatherValidator;
    @Inject
    private WeatherHelper weatherHelper;
    @Inject
    private WeatherApi weatherApi;



    @Override
    public Weather getWeather(String id) {
        Weather weather = weatherRepository.getWeatherByCityId(id);
        if (weather == null){
            WeatherResponse weatherResponse = weatherApi.getWeatherResponse(id);
            weather = weatherHelper.generateWeather(id, weatherResponse);
            weatherRepository.add(weather);
        } else {
            if(weatherValidator.isTerminated(weather)) {
                weatherRepository.remove(weather);
                WeatherResponse weatherResponse = weatherApi.getWeatherResponse(id);
                weather = weatherHelper.generateWeather(id, weatherResponse);
                weatherRepository.add(weather);
            }
        }

        return weather;
    }


}
