package com.cloudfly.designpatterns.behavioral.memento;

import lombok.Data;

@Data
public class Original {

    private String value;
    
    public Original(String value){
        this.value = value;
    }
    
    public Memento CreateMemento(){
        return new Memento(value);
    }
    
    public void restoreMemento(Memento memento){
        this.value=memento.getValue();
    }
}
