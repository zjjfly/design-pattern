package com.github.zjjfly.adapter;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/23
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
