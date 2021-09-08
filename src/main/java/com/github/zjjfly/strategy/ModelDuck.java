package com.github.zjjfly.strategy;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
