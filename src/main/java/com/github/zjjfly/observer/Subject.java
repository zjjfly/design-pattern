package com.github.zjjfly.observer;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
