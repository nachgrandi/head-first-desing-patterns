package Observer.Subject;

import Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject  {
    private final List<Observer> observers;
    private float temp;
    private float humidity;
    private float preassure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        boolean exist = observers.contains(observer);
        if (exist) observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        observers.forEach(
            Observer::update
        );
    }

    public void setMeasurement(float temp, float humidity, float preassure) {
        this.temp = temp;
        this.humidity = humidity;
        this.preassure= preassure;
        notifyObserver();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPreassure() {
        return preassure;
    }
}
