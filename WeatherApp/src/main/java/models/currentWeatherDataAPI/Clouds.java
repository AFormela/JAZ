package models.currentWeatherDataAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {
    private double all;

    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }
}
