package com.cloudfly.designpatterns.creational.abstractfactory;

import com.cloudfly.designpatterns.creational.factorymethod.MailSender;
import com.cloudfly.designpatterns.creational.factorymethod.Sender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produre() {
        return new MailSender();
    }

}
