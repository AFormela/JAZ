package rest;

import models.currentWeatherDataAPI.WeatherResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class WeatherApi {
    private final static String URI = "https://api.openweathermap.org/data/2.5/weather";
    private final static String KEY = "e155af86cb9db28df717c9a02bdfee67";

    public WeatherResponse getWeatherResponse(String id) {
        return ClientBuilder.newClient()
                .target(URI)
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("appid", KEY)
                .queryParam("id", id)
                .request(MediaType.APPLICATION_JSON)
                .get(WeatherResponse.class);
    }
}
