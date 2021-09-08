package com.github.zjjfly.observer.jdk;

import com.github.zjjfly.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zjjfly
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;

    private float minTemp = 200;

    private float tempSum = 0.0f;

    private int numReadings;

    private Observable obs;

    public StatisticsDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                                   + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }
}
