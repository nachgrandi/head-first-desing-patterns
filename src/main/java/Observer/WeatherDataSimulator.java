package Observer;


import Observer.Observer.CurrentConditionDisplay;
import Observer.Subject.WeatherData;

public class WeatherDataSimulator {
    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(10,11,12);
    }
}
