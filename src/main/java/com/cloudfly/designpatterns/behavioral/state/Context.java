package com.cloudfly.designpatterns.behavioral.state;

import lombok.Data;

@Data
public class Context {
    private State state;
    
    public Context(State state){
        this.state = state;
    }
    public void method(){
        if("state1".equals(state.getValue())){
            state.method1();
        }else if("state2".equals(state.getValue())){
            state.method2();
        }
    }
}
