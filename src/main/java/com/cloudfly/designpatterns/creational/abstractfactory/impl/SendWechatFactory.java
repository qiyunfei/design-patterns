package com.cloudfly.designpatterns.creational.abstractfactory.impl;

import com.cloudfly.designpatterns.creational.abstractfactory.Provider;
import com.cloudfly.designpatterns.creational.factorymethod.Sender;
import com.cloudfly.designpatterns.creational.factorymethod.impl.WechatSender;

public class SendWechatFactory implements Provider {

    @Override
    public Sender produre() {
        return new WechatSender();
    }

}
