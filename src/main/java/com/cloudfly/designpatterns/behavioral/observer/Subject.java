package com.cloudfly.designpatterns.behavioral.observer;

public interface Subject {
    /**
      * 
      * 添加观察者 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @param observer
      * void
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    void add(Observer observer);
    
    /**
      * 
      * 删除观察者<br/>
      *
      * @category 
      * @author yunfei.qi
      * @param observer
      * void
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    void del(Observer observer);

    /**
      * 
      * 通知所有的观察者<br/>
      *
      * @category 
      * @author yunfei.qi
      * void
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    void notifyObservers();
    
    /**
      * 
      *自身行为 <br/>
      *
      * @category 
      * @author yunfei.qi
      * void
      * @created 2017年9月29日
      * @since JDK 1.8
      */
    void operation();

}
