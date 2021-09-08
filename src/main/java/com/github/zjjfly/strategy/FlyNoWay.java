package com.github.zjjfly.strategy;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can't fly");
    }
}
