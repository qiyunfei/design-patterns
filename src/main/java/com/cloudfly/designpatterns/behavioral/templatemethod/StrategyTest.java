package com.cloudfly.designpatterns.behavioral.templatemethod;

public class StrategyTest {

    public static void main(String[] args) {
        String exp1= "20+8";
        AbstractCalculator cal1 = new Plus();
        int result1 = cal1.calculator(exp1, "\\+");
        System.out.println(result1);
        
        String exp2= "20-8";
        AbstractCalculator cal2 = new Minus();
        int result2 = cal2.calculator(exp2, "-");
        System.out.println(result2);
        
        String exp3= "20*8";
        AbstractCalculator cal3 = new Miltiply();
        int result3 = cal3.calculator(exp3, "\\*");
        System.out.println(result3);
    }
}
