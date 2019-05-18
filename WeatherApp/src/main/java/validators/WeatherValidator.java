package validators;

import models.weather.Weather;

public interface WeatherValidator {
    boolean isTerminated(Weather weather);
}
