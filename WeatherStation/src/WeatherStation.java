import displays.CurrentConditionsDisplay;
import displays.DisplayElement;
import displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80.5f, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 20);
        weatherData.setMeasurements(71, 93.2f, 24.6f);
    }
}
