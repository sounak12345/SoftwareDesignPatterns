import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String temperature;
    private String humidity;
    private String pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : o) {
            observer.update(temperature,humidity,pressure); //Remove Line regarding for loop
        }
    }

    @Override
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void setMeasurements(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }
}