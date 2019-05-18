package models.weather;

import java.util.Date;

public class Weather {
    private City city;
    private double clouds;
    private double pressure;
    private double temp;
    private double windSpeed;
    private Date date;

    public Weather(City city, double clouds, double pressure, double temp, double windSpeed) {
        this.city = city;
        this.clouds = clouds;
        this.pressure = pressure;
        this.temp = temp;
        this.windSpeed = windSpeed;
        this.date = new Date();
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
