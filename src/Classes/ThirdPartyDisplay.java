

public class WeatherThirdPartyDisplay implements Observer, DisplayElement {
    private string ThirdPartyEU = "Europe";
    private string ThirdPartyAU = "Africa";
    private string ThirdPartyEast = "Asia";
    private string ThirdPartyLatin = "South America";
    private float temperature;
    private float humidity;
    private float pressure;
    int channel = 2;

    private Subject weatherData;

    public WeatherThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure, int channel) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        if(channel != null) {
            System.out.println("Error");
        }
        else if (channel = 1) {
            System.out.println("Current Channel: " + ThirdPartyEU);
        }
        else if (channel = 2) {
            System.out.println("Current Channel: " + ThirdPartyAU);
        }
        else if (channel = 3) {
            System.out.println("Current Channel: " + ThirdPartyEast);
        }
        else if (channel = 4) {
            System.out.println("Current Channel: " + ThirdPartyLatin);
        }
        display();
    }

    public void display() {
    System.out.println("Current Conditions: " + temperature +
            "F degrees and " + humidity + "% humidity");
    }

}