package com.itheima.defaultAndStatic;

public interface MyInterface2 {

    default void method(){
        System.out.println("myInterface2 default method");
    }
}
