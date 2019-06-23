package displays;

import observer.Observer;
import subject.Subject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private List<Float> temperatures;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperatures = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + getStatistic());
    }

    private String getStatistic() {
        return getAverage() + "/" + getMax() + "/" + getMin();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        display();
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
