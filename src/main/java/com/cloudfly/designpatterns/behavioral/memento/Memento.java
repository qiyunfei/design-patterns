package com.cloudfly.designpatterns.behavioral.memento;

import lombok.Data;

@Data
public class Memento {
   

    private String value;
    
    public Memento(String value2) {
        this.value=value2;
    }
}
