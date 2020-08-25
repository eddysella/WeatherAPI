package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output;

import java.io.Serializable;

public class City implements Serializable {

    private String cityID;
    private double minTemp;
    private double maxTemp;
    private double averageTemp;
    private String weatherDescription;

    public City(){}

    public City(String cityID, double minTemp, double maxTemp, double averageTemp, String description) {
        this.cityID = cityID;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.averageTemp = averageTemp;
        this.weatherDescription = description;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
