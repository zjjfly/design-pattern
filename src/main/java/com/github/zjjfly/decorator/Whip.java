package com.github.zjjfly.decorator;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
public class Whip extends CondimentDecoradtor {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }
}
