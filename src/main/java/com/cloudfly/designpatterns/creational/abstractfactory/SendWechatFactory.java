package com.cloudfly.designpatterns.creational.abstractfactory;

import com.cloudfly.designpatterns.creational.factorymethod.Sender;
import com.cloudfly.designpatterns.creational.factorymethod.WechatSender;

public class SendWechatFactory implements Provider {

    @Override
    public Sender produre() {
        return new WechatSender();
    }

}
