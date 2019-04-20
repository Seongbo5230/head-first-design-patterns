public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(60, 68, 25.4f);
    currentDisplay.update(60, 68, 25.4f);
    weatherData.setMeasurements(67, 64, 28.4f);
    currentDisplay.update(67, 64, 28.4f);
    weatherData.setMeasurements(71, 73, 24.9f);
    currentDisplay.update(71, 73, 24.9f);
  }
}
