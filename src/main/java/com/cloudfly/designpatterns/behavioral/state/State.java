package com.cloudfly.designpatterns.behavioral.state;

import lombok.Data;

@Data
public class State {
    
    private String value;
    
    public void method1(){
        System.out.println("excute the first opt!");
    }
    
    public void method2(){
        System.out.println("excute the second opt!");
    }
    
}
