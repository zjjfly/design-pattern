package com.github.zjjfly.command;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/23
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
