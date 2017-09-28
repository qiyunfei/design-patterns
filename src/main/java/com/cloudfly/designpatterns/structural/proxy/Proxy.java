package com.cloudfly.designpatterns.structural.proxy;

public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method1() {
        before();
        source.method1();
        after();
    }

    private void after() {
        System.out.println("after proxy!");

    }

    private void before() {
        System.out.println("before proxy!");

    }

}
