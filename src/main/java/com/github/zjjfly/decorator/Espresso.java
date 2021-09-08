package com.github.zjjfly.decorator;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
