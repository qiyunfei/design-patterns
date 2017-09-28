package com.cloudfly.designpatterns.creational.Prototype;

import java.io.IOException;

public class PrototypeTest {
    public static void main(String[] args) {
        

        Prototype src1 = new Prototype();
        src1.setName("11");
        Object dest1 = null;
        try {
            dest1 = src1.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("src1:"+src1);
        System.out.println("dest1:"+dest1);
        ((Prototype)dest1).setName("22");
        System.out.println("src1:"+src1);
        System.out.println("dest1:"+dest1);


        PrototypeDeep src2 = new PrototypeDeep();
        src2.setName("src2").setObject(new SerializableObject().setName("obj1"));
       
        Object dest2 = null;
        Object dest3 = null;

        try {
            dest2 = src2.clone();
            dest3 = src2.deepClone();
        } catch (CloneNotSupportedException | ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("src2:"+src2);
        System.out.println("dest2:"+dest2);
        System.out.println("dest3:"+dest3);

        ((PrototypeDeep)dest2).getObject().setName("obj22222");
        ((PrototypeDeep)dest3).getObject().setName("obj33333");

        System.out.println("src2:"+src2);
        System.out.println("dest2:"+dest2);
        System.out.println("dest3:"+dest3);


    }
}
