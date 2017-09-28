package com.cloudfly.designpatterns.creational.Prototype;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Accessors(chain=true)
@NoArgsConstructor
@Data
public class SerializableObject implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
