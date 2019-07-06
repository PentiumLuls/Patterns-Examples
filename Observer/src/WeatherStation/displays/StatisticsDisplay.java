package WeatherStation.displays;

import WeatherStation.weatherData.WeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private List<Float> temperatures;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        temperatures = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + getStatistic());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData)
        this.temperatures.add(((WeatherData) o).getTemperature());
        display();
    }

    private String getStatistic() {
        return getAverage() + "/" + getMax() + "/" + getMin();
    }

    private float getAverage() {
        return (float) temperatures.stream()
                .mapToDouble(value -> value)
                .average()
                .orElse(0);
    }

    private float getMax() {
        return (float) temperatures.stream()
                .mapToDouble(value -> value)
                .max()
                .orElse(0);
    }

    private float getMin() {
        return (float) temperatures.stream()
                .mapToDouble(value -> value)
                .min()
                .orElse(0);
    }
}
