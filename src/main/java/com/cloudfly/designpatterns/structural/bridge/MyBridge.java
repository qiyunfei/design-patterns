package com.cloudfly.designpatterns.structural.bridge;

public class MyBridge extends Bridge {

    public void method1(){
        getSource().method1();
    }
}
