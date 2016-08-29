package practice.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float pressure;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions of weather----->pressure---->"+pressure);
        System.out.println("Current Conditions of weather----->temperature---->"+temperature);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.pressure=pressure;
        display();
    }
}
