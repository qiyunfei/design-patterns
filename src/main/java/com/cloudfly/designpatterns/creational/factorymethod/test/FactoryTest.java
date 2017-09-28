package com.cloudfly.designpatterns.creational.factorymethod.test;

import com.cloudfly.designpatterns.creational.factorymethod.SendFactory;
import com.cloudfly.designpatterns.creational.factorymethod.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        //测试 普通工厂方法模式
        System.out.println("---------------测试普通工厂方法模式开始---------------------");
        Sender sender1 = factory.produre("sms");
        Sender sender2 = factory.produre("mail");
        Sender sender3 = factory.produre("xxxx");
        if(sender1 != null){
            sender1.send();
        }
        if(sender2 != null){
            sender2.send();
        }
        if(sender3 != null){
            sender3.send();
        }
        System.out.println("---------------测试普通工厂方法模式结束---------------------");

        //测试多个工厂方法模式
        System.out.println("---------------测试多个工厂方法模式开始---------------------");
        Sender senderMail= factory.produreMail();
        Sender senderSms =  factory.produreSms();
        senderMail.send();
        senderSms.send();
        System.out.println("---------------测试多个工厂方法 模式结束---------------------");

        
        //测试静态工厂方法模式
        System.out.println("---------------测试静态工厂方法模式开始---------------------");
        Sender senderMail2= SendFactory.staticProdureMail();
        Sender senderSms2 = SendFactory.staticProdureSms();
        senderMail2.send();
        senderSms2.send();
        System.out.println("---------------测试静态工厂方法 模式结束---------------------");
    }
}
