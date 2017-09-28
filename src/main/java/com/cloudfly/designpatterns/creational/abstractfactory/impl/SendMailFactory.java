package com.cloudfly.designpatterns.creational.abstractfactory.impl;

import com.cloudfly.designpatterns.creational.abstractfactory.Provider;
import com.cloudfly.designpatterns.creational.factorymethod.Sender;
import com.cloudfly.designpatterns.creational.factorymethod.impl.MailSender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produre() {
        return new MailSender();
    }

}
