package com.cloudfly.designpatterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        System.out.println(builder.getList().size());
    }

}
