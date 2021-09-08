package com.github.zjjfly.strategy;

import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
@NoArgsConstructor
@Setter
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float,even decoys");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
