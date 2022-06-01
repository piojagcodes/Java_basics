package pl.attilluss.Weather;

public class WeatherMainClass {

    public String WeatherForecast(long kmh) {
        return "Weather forecast suggests wind at " + kmh;
    }

    public String Sunny() {
        return "Sky is clear so it's sunny";
    }

    public String Rainy() {
        return "Its cloudy so soon there will be rain";
    }
}
