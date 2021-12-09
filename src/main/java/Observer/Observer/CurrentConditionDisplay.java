package Observer.Observer;

import Observer.Subject.Subject;
import Observer.Subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private Subject subject;
    private float temp;
    private float humidity;
    private float preassure;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("La temperatura es %s, la humedad es %s y la presion es %s%n",
                this.temp, this.humidity, this.preassure);
    }

    @Override
    public void update() {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            temp = weatherData.getTemp();
            humidity = weatherData.getHumidity();
            preassure = weatherData.getPreassure();
            display();
        }
    }
}
