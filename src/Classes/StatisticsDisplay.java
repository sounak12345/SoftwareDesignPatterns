import src.Interfaces.Observer;
import src.Interfaces.DisplayElement;

public class WeatherStatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;  // Set to a high initial value
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public WeatherStatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}