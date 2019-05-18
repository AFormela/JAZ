package validators;

import models.weather.Weather;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class WeatherValidatorImpl implements WeatherValidator {
    @Override
    public boolean isTerminated(Weather weather) {
        return (new Date().getTime() - weather.getDate().getTime() >= 15*60*1000);
    }
}
