package dependency_injection_principle.violates_dip;

// Violates DIP as the weather app directly depends upon concrete class AccuWeatherApi
// Will be harder to replace the underlying API in the future
public class WeatherApp {
    AccuWeatherApi accuWeatherApi = new AccuWeatherApi();

    public void showWeather() {
        String weather = accuWeatherApi.fetchWeather();
        //...
    }
}
