package com.cloudfly.designpatterns.creational.singleton;

/**
 * @ClassName:SingletonEnum.java
 * @Description:
 * @author yunfei.qi
 * @date 2017年9月27日 下午5:33:31
 */
public enum SingletonEnum {
    INSTANCE;
    
    private Singleton singleton;

    public Singleton getSingleton() {
        return singleton;
    }

    private SingletonEnum() {
        this.singleton = new Singleton();
    }
    
    
}
