package com.itheima.defaultAndStatic;

public interface MyInterface {

    default void method(){
        System.out.println("myInterface default method");
    }
}
