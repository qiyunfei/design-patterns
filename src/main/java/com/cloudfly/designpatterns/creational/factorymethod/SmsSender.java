package com.cloudfly.designpatterns.creational.factorymethod;

public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("[SmsSender]send method ->send sms msg");
    }

}
