package com.github.zjjfly.observer;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
