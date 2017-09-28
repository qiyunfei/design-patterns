package com.cloudfly.designpatterns.structural.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        System.out.println("---------------测试类的适配器模式开始---------------------");
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
        System.out.println("---------------测试类的适配器模式开始---------------------");

        
        System.out.println("---------------测试对象的适配器模式开始---------------------");
        Targetable targetable2 = new Wrapper(new Source());
        targetable2.method1();
        targetable2.method2();
        System.out.println("---------------测试对象的适配器模式开始---------------------");

    }
}
