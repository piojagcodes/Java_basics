package pl.attilluss.Flower_Environment;

import pl.attilluss.Weather.WeatherMainClass;

public class FlowerEnvironmentMainClass extends WeatherMainClass {

    @Override
    public String WeatherForecast(long kmh) {
        return "Weather forecast suggests wind at " + kmh + "kmh";
    }
}
