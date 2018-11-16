package com.myjava02;
/*
    类的定义：
        类是用来描述现实世界的事务
    事务：属性和行为
    属性：描述信息
    行为; 功能

    类是如何和事务进行对应？
        类：
            成员变量
            成员方法
    需求：写一个学生类

    学生事务：
        属性：姓名，年龄，性别，
        行为：学习，吃饭，休息。。
    学生类：
        成员变量：姓名，年龄；
        成员方法：学习，吃饭
    成员变量：与之前的变量的定义一样
            位置不同，类中方法外
            初始化值：不需要给值
    成员方法：与之前的方法的定义一样
            去掉static关键词
 */
public class Student {
//    成员变量；
//    姓名
    String name;
//    年龄
    int age;
//    成员方法
//    学习方法
    public void study(){
        System.out.println("好好学习，天天向上");
    }
//    吃饭方法
    public void eat(){
        System.out.println("按时吃饭");
    }
}
