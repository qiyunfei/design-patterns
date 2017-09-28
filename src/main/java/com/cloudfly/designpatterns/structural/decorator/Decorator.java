package com.cloudfly.designpatterns.structural.decorator;

public class Decorator implements Sourceable{
    
    private Sourceable source;
    
    public Decorator (Sourceable source){
        super();
        this.source=source;
    }

    @Override
    public void method1() {
        System.out.println("befor decorator!");
        source.method1();
        System.out.println("after decorator!");        
    }

    
}
