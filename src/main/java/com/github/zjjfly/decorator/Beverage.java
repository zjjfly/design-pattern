package com.github.zjjfly.decorator;

import lombok.Getter;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/22
 */
@Getter
public abstract class Beverage {

    String description = "Unknown Beverage";

    public abstract double cost();

}
