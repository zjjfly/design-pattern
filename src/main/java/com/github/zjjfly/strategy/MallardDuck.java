package com.github.zjjfly.strategy;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
