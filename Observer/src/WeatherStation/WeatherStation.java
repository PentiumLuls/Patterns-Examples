package WeatherStation;

import WeatherStation.displays.CurrentConditionsDisplay;
import WeatherStation.displays.DisplayElement;
import WeatherStation.displays.StatisticsDisplay;
import WeatherStation.weatherData.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 20);
        weatherData.setMeasurements(72, 93, 24.5f);
    }
}
