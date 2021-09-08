package com.github.zjjfly.decorator;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.49;
    }
}
