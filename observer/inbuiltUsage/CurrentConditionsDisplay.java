package practice.observer.inbuiltUsage;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private Observable observable;
    private float temperature;
    private float pressure;


    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions of weather----->pressure---->"+pressure);
        System.out.println("Current Conditions of weather----->temperature---->"+temperature);
    }

    @Override
    public void update(Observable obs,Object obj) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            this.temperature=weatherData.getTemperature();
            this.pressure=weatherData.getPressure();
            display();
        }
    }
}
