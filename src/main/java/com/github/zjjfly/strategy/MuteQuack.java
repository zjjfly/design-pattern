package com.github.zjjfly.strategy;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/20
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
