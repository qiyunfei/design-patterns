package com.cloudfly.designpatterns.structural.adapter;

public interface Targetable {

    
    /**
      * 
      * 与原（Source）类的方法相同<br/>
      *
      * @category 
      * @author yunfei.qi
      * void
      * @created 2017年9月28日
      * @since JDK 1.8
      */
    void method1();
    
    /**
      * 
      *新类的方法 <br/>
      *
      * @category 
      * @author yunfei.qi
      * void
      * @created 2017年9月28日
      * @since JDK 1.8
      */
    void method2();
}
