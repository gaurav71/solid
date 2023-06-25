package dependency_inversion_principle.maintains_dip;
public class WeatherApp {
    WeatherApi weatherApi = new AccuWeatherApi();

    public void showWeather() {
        String weather = weatherApi.fetchWeather();
        //...
    }
}
