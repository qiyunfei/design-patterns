package com.cloudfly.designpatterns.structural.adapter;

/**
 * @ClassName:Wrapper2.java
 * @Description:实现所有方法 声明为抽象类
 * @author yunfei.qi
 * @date 2017年9月28日 下午2:46:33 
 */
public abstract class Wrapper2 implements Sourceable {

    @Override
    public void method1() {
        System.out.println("this is Wrapper2 method1");
    }

    @Override
    public void method2() {
        System.out.println("this is Wrapper2 method2");
    }

    @Override
    public void method3() {
        System.out.println("this is Wrapper2 method3");
    }


}
