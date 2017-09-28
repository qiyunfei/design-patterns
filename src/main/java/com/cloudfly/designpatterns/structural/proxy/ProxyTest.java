package com.cloudfly.designpatterns.structural.proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Sourceable source = new Proxy();
        source.method1();
    }
}
