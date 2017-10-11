package com.cloudfly.designpatterns.behavioral.mediator;

public class User1 extends User{

    public User1(Mediator meditor) {
        super(meditor);
    }

    @Override
    void work() {
        System.out.println("user1 exe!");

    }
   
}
