package com.github.zjjfly.decorator;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description="Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
