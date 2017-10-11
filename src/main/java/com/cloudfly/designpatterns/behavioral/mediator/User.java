package com.cloudfly.designpatterns.behavioral.mediator;

public abstract class User {
    private Mediator meditor;
    public Mediator getMediator(){
        return meditor;
    }
    
    public User(Mediator meditor){
        this.meditor = meditor;
    }
    
    abstract void work();
}
