package com.cloudfly.designpatterns.behavioral.memento;

import lombok.Data;

@Data
public class Storage {
    private Memento memento;
    public Storage(Memento memento){
        this.memento=memento;
    }
}
