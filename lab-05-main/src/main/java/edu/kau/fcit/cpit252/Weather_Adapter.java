package edu.kau.fcit.cpit252;
import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class Weather_Adapter implements WeatherGeo{
    private WeatherCity weatherCity;
    private GeoLocation geoLocation;

    public Weather_Adapter(WeatherCity weatherCity){

        this.weatherCity = weatherCity;
        this.geoLocation = new GeoLocation();
    }


    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        String cityName = this.geoLocation.search(latitude, longitude);
        return weatherCity.getWeatherInfo(cityName);
    }
}
