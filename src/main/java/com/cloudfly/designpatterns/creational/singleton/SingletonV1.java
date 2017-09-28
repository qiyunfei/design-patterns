package com.cloudfly.designpatterns.creational.singleton;

/**
 * @ClassName:Singleton1.java
 * @Description:这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了，
 * 如何解决？我们首先会想到对getInstance方法加synchronized关键字
 * @author yunfei.qi
 * @date 2017年9月27日 下午5:33:31 
 */
public class SingletonV1 {
    /*持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonV1 instance = null;

   
    /**
     * 私有构造方法，防止被实例化
     */
    private SingletonV1() {
    }
    /**
      * 
      * 静态方法创建实例<br/>
      *（懒汉，线程不安全）<br/>
      * @category 
      * @author yunfei.qi
      * @return Singleton1
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public static SingletonV1 getInstance(){
        if(instance == null){
            return new SingletonV1();
        }
        return instance;
    }
    /**
      * 
      * 如果该对象被用于序列化,可以保证对象在序列化前后保持一致<br/>
      *
      * @category 
      * @author yunfei.qi
      * @return Object
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public Object readResolve(){
        return instance;
    }
}
