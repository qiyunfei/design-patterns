package com.cloudfly.designpatterns.structural.decorator;

public class DecoratorTest{
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable obj  = new Decorator(sourceable);
        obj.method1();
    }
    
}
