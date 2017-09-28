package com.cloudfly.designpatterns.structural.facade;

public class User {
    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer();
        
        computer.startup();
        Thread.sleep(10000L);
        computer.shutdown();
    }
}
