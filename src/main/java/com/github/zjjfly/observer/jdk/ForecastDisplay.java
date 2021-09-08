package com.github.zjjfly.observer.jdk;

import com.github.zjjfly.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zjjfly
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    private Observable obs;

    public ForecastDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }

    @Override
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

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            float pressure = ((WeatherData) o).getPressure();
            lastPressure = currentPressure;
            currentPressure = pressure;
            display();
        }
    }
}
