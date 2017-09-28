package com.cloudfly.designpatterns.creational.Prototype;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName:Prototype.java
 * @Description:浅复制
 * @author yunfei.qi
 * @date 2017年9月27日 下午8:15:07 
 */
@Accessors(chain=true)
@NoArgsConstructor
@Data
public class Prototype implements Cloneable{

    private String name;
    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException{
        Prototype prototype= (Prototype)super.clone();
        return prototype;
    }
    
}
