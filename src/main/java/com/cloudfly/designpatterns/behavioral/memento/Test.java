package com.cloudfly.designpatterns.behavioral.memento;

public class Test {

    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("egg");
        //创建备忘录
        Storage storage = new Storage(original.CreateMemento());
        
        //修改原始类的状态
        System.out.println("初始状态为："+original.getValue());
        original.setValue("niu");
        System.out.println("修改后状态为："+original.getValue());

        //恢复原始类状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后状态为："+original.getValue());
        
    }
}
