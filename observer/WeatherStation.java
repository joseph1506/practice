package practice.observer;

public class WeatherStation {

    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(20,40,30);
        weatherData.setMeasurements(50,60,70);
        weatherData.setMeasurements(80,30,40);
    }



}
