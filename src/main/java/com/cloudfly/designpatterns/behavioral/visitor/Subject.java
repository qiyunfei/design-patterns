package com.cloudfly.designpatterns.behavioral.visitor;

public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
