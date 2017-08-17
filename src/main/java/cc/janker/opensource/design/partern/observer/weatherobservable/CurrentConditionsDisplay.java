package cc.janker.opensource.design.partern.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhiyongliu3 on 2017/8/17.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
