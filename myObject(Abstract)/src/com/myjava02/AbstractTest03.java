package com.myjava02;
/*
    足疗店：
        技师
            足疗技师
            其他技师
        共性：
            属性 姓名，年龄，
            行为 服务
 */
public class AbstractTest03 {
    public static void main(String[] args) {
        BasicMassage bm = new BasicMassage();
        bm.service();
        OtherMassage om = new OtherMassage();
        om.service();
    }
}

abstract class Massage{
    String name;
    int age;
//    服务
    public abstract void service();
}

class BasicMassage extends Massage{

    @Override
    public void service() {
        System.out.println("按摩足部");
    }
}

class OtherMassage extends Massage{

    @Override
    public void service() {
        System.out.println("你懂的");
    }
}