package com.myjava01;
/*
    抽象类的特点:
        A：抽象方法只能在抽象类里；
        B：抽象类与抽象方法必须被abstract修饰
        C: 抽象类不能创建对象（不能实例化）
        D：抽象类和类的关系也是继承
            一个类继承了抽象类，要么重写所有的抽象方法，要么就是抽象类
        E：
 */
public class AbstractDemo02 {
    public static void main(String[] args) {
    }
}


abstract class Animal1{
    public abstract void eat();
    public void run(){

    }
}

class Cat1 extends Animal1{

    @Override
    public void eat() {

    }
}
