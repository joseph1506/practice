package practice.observer;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = newArrayList();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);

    }

    @Override
    public void removeObserver(Observer obs) {
        int i=observers.indexOf(obs);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
         for(Observer obs:observers){
             obs.update(temperature,humidity,pressure);
         }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

}
