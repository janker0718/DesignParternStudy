package cc.janker.opensource.design.partern.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhiyongliu3 on 2017/8/17.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
