package com.github.zjjfly.decorator;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
public class Soy extends CondimentDecoradtor {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
