package practice.observer.inbuiltUsage;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private Observable observable;
    private float temperature;
    private float pressure;
    private float humidity;


    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistical display of weather----->pressure---->"+pressure);
        System.out.println("Statistical display of weather----->temperature---->"+temperature);
        System.out.println("Statistical display of weather----->humidity---->"+humidity);
    }

    @Override
    public void update(Observable observable,Object obj) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            this.temperature=weatherData.getTemperature();
            this.pressure=weatherData.getPressure();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
