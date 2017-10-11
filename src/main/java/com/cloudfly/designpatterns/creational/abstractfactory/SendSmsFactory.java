package com.cloudfly.designpatterns.creational.abstractfactory;

import com.cloudfly.designpatterns.creational.factorymethod.Sender;
import com.cloudfly.designpatterns.creational.factorymethod.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produre() {
        return new SmsSender();
    }

}
