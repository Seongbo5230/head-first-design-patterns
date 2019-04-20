public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(78, 64, 31.4f);
    currentDisplay.update(78, 64, 31.4f);
    weatherData.setMeasurements(82, 70, 29.1f);
    currentDisplay.update(82, 70, 29.1f);
    weatherData.setMeasurements(75, 78, 28.9f);
    currentDisplay.update(75, 78, 28.9f);
  }
}