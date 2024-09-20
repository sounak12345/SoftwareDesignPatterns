import java.util.ArrayList;

public class WeatherData implements Subject {
    //https://stackoverflow.com/questions/50183111/the-best-way-to-have-multiple-observer-lists-in-observer-pattern
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
        for (Observer o : o) {  ////https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html
            observer.update(temperature,humidity,pressure); //Remove Line regarding for loop
        }
    }

    public String getTemperature() {return temperature;}
    public String getHumidity() {return humidity;}
    public String getPressure() {return pressure;}

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