package com.itheima.defaultAndStatic;

public class MySon extends MyParent implements MyInterface{

   /* 当一个类继承一个类，并且实现一个或者多个接口的时候，其中，父类和父接口中存在相同的方法。

            　　如果子类中存在该方法的实现体或者说是覆盖，则使用该类的对象去掉用该方法时候，其实掉用的是来自接口的实现方法，而不是来自父类方法的覆盖。

            　　如果子类中不存在该方法的实现[或者覆盖],在使用该类对象掉用该方法的时候，就会使用从父类继承的方法。同时将这个从父类继承来的方法当作接口方法的实现，也就可以不再实现接口的方法体。

    另外值得注意的就是，extends & implements 的书写顺序不能改变。

    为了方便记忆可以认为：接口的优先级别要高于父类。
    */

    public static void main(String[] args) {
        MySon mySon=new MySon();
        mySon.method();
    }
}
