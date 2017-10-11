package com.cloudfly.designpatterns.behavioral.mediator;

public  class User2 extends User{

    public User2(Mediator meditor) {
        super(meditor);
    }

    @Override
    void work() {
        System.out.println("user2 exe!");
    }
    
}

