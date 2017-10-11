package com.cloudfly.designpatterns.creational.abstractfactory;

import com.cloudfly.designpatterns.creational.factorymethod.Sender;

public class AbstractFactoryTest {

    public static void main(String[] args) {
       
        //测试抽象工厂模式
        System.out.println("---------------测试抽象工厂模式开始---------------------");
        Provider providerSms = new SendSmsFactory();
        Provider providerMail = new SendMailFactory();
        Sender senderMail= providerSms.produre();
        Sender senderSms = providerMail.produre();
        senderMail.send();
        senderSms.send();
        System.out.println("---------------测试抽象工厂模式结束---------------------");
        
        System.out.println("---------------测试抽象工厂模式扩展性开始---------------------");
        Provider providerWechat = new SendWechatFactory();
        Sender senderWechat= providerWechat.produre();
        senderWechat.send();
        System.out.println("---------------测试抽象工厂模式扩展性结束---------------------");
    }

}
