package com.cloudfly.designpatterns.structural.composite;

import java.util.Enumeration;
import java.util.Vector;

import lombok.Data;

@Data

public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();
    //添加
    public void add(TreeNode node){
        children.add(node);
    }
    
    public void remove(TreeNode node){
        children.remove(node);
    }
    
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }

    public TreeNode(String name) {
        super();
        this.name = name;
    }
    
}
