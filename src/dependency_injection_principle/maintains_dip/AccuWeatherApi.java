package dependency_injection_principle.maintains_dip;

public class AccuWeatherApi implements WeatherApi {
    @Override
    public String fetchWeather() {
        return "Sunny Ain't it";
    }
}
