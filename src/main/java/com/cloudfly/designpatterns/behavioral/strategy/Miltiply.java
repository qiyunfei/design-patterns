package com.cloudfly.designpatterns.behavioral.strategy;

public class Miltiply extends AbstractCalculator implements ICalculator{

    @Override
    public int calculator(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }

}
