package com.github.zjjfly.command;

/**
 * @author zjjfly[https://github.com/zjjfly] on 2020/6/23
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){};

    public void setCommand(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
