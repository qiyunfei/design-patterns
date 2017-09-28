package com.cloudfly.designpatterns.structural.proxy;

public class Source implements Sourceable {

    @Override
    public void method1() {
        System.out.println("this is origin method.");
        
    }
    
}
