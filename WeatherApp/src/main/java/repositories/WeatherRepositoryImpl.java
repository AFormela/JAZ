package repositories;

import models.weather.Weather;

import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class WeatherRepositoryImpl implements WeatherRepository {

    private List<Weather> weathers = new ArrayList<Weather>();

    @Override
    public void add(Weather weather) {
        weathers.add(weather);
    }

    @Override
    public void remove(Weather weather) {
        weathers.remove(weather);
    }

    @Override
    public Weather getWeatherByCityId(String id) {
        for (Weather weather : weathers) {
            if (weather.getCity().getId().equals(id)) {
                return weather;
            }
        }
        return null;
    }
}

