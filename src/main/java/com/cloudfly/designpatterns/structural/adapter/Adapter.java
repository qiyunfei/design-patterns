package com.cloudfly.designpatterns.structural.adapter;

/**
 * @ClassName:Adapter.java
 * @Description:Adapter类继承Source类，实现Targetable接口
 * @author yunfei.qi
 * @date 2017年9月28日 下午2:26:21 
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is the  targetable method");
    }

}
