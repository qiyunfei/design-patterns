package com.cloudfly.designpatterns.creational.factorymethod;

import com.cloudfly.designpatterns.creational.factorymethod.impl.MailSender;
import com.cloudfly.designpatterns.creational.factorymethod.impl.SmsSender;

public class SendFactory {
    
    /**
      * 
      * 普通工厂方法<br/>
      *
      * @category 
      * @author yunfei.qi
      * @param type
      * @return Sender
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public Sender produre(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
    
    /**
      * 
      *多个工厂方法->sms工厂 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return Sender
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public Sender produreSms(){
        return new SmsSender();
    }
    /**
     * 
     *多个工厂方法->mail工厂 <br/>
     *
     * @category 
     * @author yunfei.qi
     * @return Sender
     * @created 2017年9月27日
     * @since JDK 1.8
     */
    public Sender produreMail(){
        return new MailSender();
    }
    

    /**
      * 
      *多个工厂方法->静态sms工厂 <br/>
      *
      * @category 
      * @author yunfei.qi
      * @return Sender
      * @created 2017年9月27日
      * @since JDK 1.8
      */
    public static Sender staticProdureSms(){
        return new SmsSender();
    }
    /**
     * 
     *多个工厂方法->静态mail工厂 <br/>
     *
     * @category 
     * @author yunfei.qi
     * @return Sender
     * @created 2017年9月27日
     * @since JDK 1.8
     */
    public static Sender staticProdureMail(){
        return new MailSender();
    }
}
