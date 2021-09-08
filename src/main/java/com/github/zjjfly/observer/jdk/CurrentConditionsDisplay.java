package com.github.zjjfly.observer.jdk;

import com.github.zjjfly.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Observable obs;

    public CurrentConditionsDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degree and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            this.temperature = temp;
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
