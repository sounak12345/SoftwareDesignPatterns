
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData appData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(appData);
        WeatherStatisticsDisplay statisicsDisplay = new WeatherStatisticsDisplay(appData);
        WeatherThirdPartyDisplay thirdPartyDisplay = new WeatherThirdPartyDisplay(appData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(appData);

        appData.setMeasurements(80,72,30.4f);
        appData.setMeasurements(82,70,29.2f);
        appData.setMeasurements(78,90,29.2f);

    }
}