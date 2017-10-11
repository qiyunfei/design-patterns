package com.cloudfly.designpatterns.creational.factorymethod;

public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("[MailSender]send method ->send mail msg");
    }

}
