package com.cloudfly.designpatterns.behavioral.interpreter;

import lombok.Data;

@Data
public class Context {
    private int num1;
    private int num2;
    public Context(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }
}
