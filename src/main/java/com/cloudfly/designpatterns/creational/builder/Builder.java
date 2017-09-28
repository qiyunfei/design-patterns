package com.cloudfly.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.cloudfly.designpatterns.creational.factorymethod.Sender;
import com.cloudfly.designpatterns.creational.factorymethod.impl.MailSender;
import com.cloudfly.designpatterns.creational.factorymethod.impl.SmsSender;

public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public List<Sender> getList() {
        return list;
    }

}
