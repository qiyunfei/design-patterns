package com.cloudfly.designpatterns.behavioral.iterator;

public interface Collection {
    Iterator iterator();
    
    /**
      * 
      *获取集合元素 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @param i
      * @return
      * Object
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    Object get(int i);
    
    /**
      * 
      * 获取集合大小 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return
      * int
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    int size();
}
