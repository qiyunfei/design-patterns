package com.cloudfly.designpatterns.creational.singleton;

/**
 * @ClassName:Singleton4.java
 * @Description:实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
 * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
 * 并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
 * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
 * @author yunfei.qi
 * @date 2017年9月27日 下午5:33:31
 */
public class SingletonV4 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
       /**
     * 私有构造方法，防止被实例化
     */
    private SingletonV4() {
    }

    /**
     * 
     * 静态方法创建实例<br/>
     * 静态内部类<br/>
     * 
     * @category @author yunfei.qi
     * @return Singleton1
     * @created 2017年9月27日
     * @since JDK 1.8
     */
    public static SingletonV4 getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 
     * 如果该对象被用于序列化,可以保证对象在序列化前后保持一致<br/>
     *
     * @category @author yunfei.qi
     * @return Object
     * @created 2017年9月27日
     * @since JDK 1.8
     */
    public Object readResolve() {
        return getInstance();
    }
    
    private static class SingletonHolder{
        private static final SingletonV4 instance = new SingletonV4();

    }
}
