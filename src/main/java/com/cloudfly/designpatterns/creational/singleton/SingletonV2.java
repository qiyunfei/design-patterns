package com.cloudfly.designpatterns.creational.singleton;

/**
 * @ClassName:Singleton1.java
 * @Description:但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，
 * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。
 * @author yunfei.qi
 * @date 2017年9月27日 下午5:33:31 
 */
public class SingletonV2 {
    /*持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonV2 instance = null;

   
    /**
     * 私有构造方法，防止被实例化
     */
    private SingletonV2() {
    }
    /**
      * 
      * 静态同步方法创建实例<br/>
      *（懒汉，线程安全）<br/>
      * @category 
      * @author yunfei.qi
      * @return Singleton1
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public static synchronized SingletonV2 getInstance(){
        if(instance == null){
            return new SingletonV2();
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
