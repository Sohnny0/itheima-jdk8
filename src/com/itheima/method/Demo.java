package com.itheima.method;

public class Demo {

    public static void main(String[] args) {

     /*   DemoServiceImpl demoServiceImpl = new DemoServiceImpl();
        // 执行默认方法
        System.out.println(demoServiceImpl.defaultMethod());
        // 执行抽象方法
        System.out.println(DemoService.staticMethod());*/

      /*  DemoService demoService = new DemoService() {
            @Override
            public String abstractMethod() {
                return null;
            }

            @Override
            public String defaultMethod() {
                return null;
            }
        };*/


      // java中接口定义是否支持方法体？ 支持, java8之后
      DemoService a =  new DemoService() {
           @Override
           public String abstractMethod() {
               return null;
           }

       };
        String s = DemoService.staticMethod();
        System.out.println(s);


    }
}
