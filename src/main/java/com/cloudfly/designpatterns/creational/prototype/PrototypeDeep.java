package com.cloudfly.designpatterns.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName:Prototype.java
 * @Description:深复制
 * @author yunfei.qi
 * @date 2017年9月27日 下午8:15:07
 */
@Accessors(chain=true)
@NoArgsConstructor
@Data
public class PrototypeDeep implements Cloneable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String name;

    private SerializableObject object;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        PrototypeDeep prototype = (PrototypeDeep) super.clone();
        return prototype;
    }

    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
