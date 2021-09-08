package com.github.zjjfly.adapter;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/23
 */
public class DuckTest {

    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
