package com.cloudfly.designpatterns.behavioral.templatemethod;

public class Plus extends AbstractCalculator{

    @Override
    int calculator(int num1, int num2) {
        return num1 + num2;
    }

   

}
