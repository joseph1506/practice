package practice.observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float pressure;
    private float humidity;


    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistical display of weather----->pressure---->"+pressure);
        System.out.println("Statistical display of weather----->temperature---->"+temperature);
        System.out.println("Statistical display of weather----->humidity---->"+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }
}
