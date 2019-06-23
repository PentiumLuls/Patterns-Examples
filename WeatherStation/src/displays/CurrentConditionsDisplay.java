package displays;

import observer.Observer;
import subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %s F degrees and %s%% humidity%n", temperature, humidity);
    }
}
