package com.itheima.functinalInterface;

@FunctionalInterface
public interface MyFunctionalInterfaceGeneric<T> {
    static String testStatic(){
        return "static";
    }

    ;

    default String getString() {
        return "default";
    }

    void exec(T t);
}
