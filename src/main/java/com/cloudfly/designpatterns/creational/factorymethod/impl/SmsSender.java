package com.cloudfly.designpatterns.creational.factorymethod.impl;

import com.cloudfly.designpatterns.creational.factorymethod.Sender;

public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("[SmsSender]send method ->send sms msg");
    }

}
