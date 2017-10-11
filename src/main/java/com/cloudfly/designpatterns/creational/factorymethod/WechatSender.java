package com.cloudfly.designpatterns.creational.factorymethod;

public class WechatSender implements Sender{

    @Override
    public void send() {
        System.out.println("[WechatSender]send method ->send Wechat msg and test abstract factory ");
    }

}
