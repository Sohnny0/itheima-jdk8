package com.itheima.functinalInterface;

import org.junit.Test;

import java.util.function.Consumer;

public class MyTest {

    public void demo(MyFunctionalInterface functionalInterface){

        functionalInterface.exec();
    }

    public <T> void demoGeneric(MyFunctionalInterfaceGeneric<? super T> functionalInterfaceGeneric) {
        functionalInterfaceGeneric.exec((T) functionalInterfaceGeneric);
    }

    public  void demoGeneric(MyFunctionalInterface functionalInterface){
         functionalInterface.exec();
    }



    @Test
    public void exec(){

        //jdk8之前
        demo(new MyFunctionalInterface(){

            @Override
            public void exec() {
                System.out.println("jdk8 before");
            }
        });

        //jdk8 lambda
        demo(()-> System.out.println("jdk8 later"));

    }

    @Test
    public void execGenric(){

        // 这里为什么一定要指定类型？ 因为有这个参数
        demoGeneric(String->System.out.println(" aaaaa"));
        demoGeneric(()->System.out.println("xxxxx"));

//        demo(()->System.out.println("bbbb"));
    }
}
