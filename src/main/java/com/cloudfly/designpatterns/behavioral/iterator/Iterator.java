package com.cloudfly.designpatterns.behavioral.iterator;

public interface Iterator {

    /**
      * 
      * 前移 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return
      * Object
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    Object previous();
    
    /**
      * 
      * 后移 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return
      * Object
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    Object next();
    
    /**
      * 
      *是否还有下一个元素 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return
      * boolean
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    boolean hasNext();
    
    /**
      * 
      * 获取第一个元素<br/>
      *
      * @category 
      * @author yunfei.qi
      * @return
      * Object
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    Object first();
}
