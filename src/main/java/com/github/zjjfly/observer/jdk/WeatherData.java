package com.github.zjjfly.observer.jdk;

import com.github.zjjfly.observer.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class WeatherData extends Observable {

    private ArrayList<Observer> observers;

    @Getter
    private float temperature;

    @Getter
    private float humidity;

    @Getter
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
