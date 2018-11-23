package com.myjava01;
/*
    抽象类的成员特点:
        成员变量：
            可以有成员变量
            可以有常量

        成员方法：
            可以有抽象方法
            可以有非常方法
        构造方法：
            可以有构造方法；
            需要对抽象类的成员变量进行初始化
    final:修饰类，成员变量，成员方法
 */
public class AbstractDemo03 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.barking();
    }
}

abstract class Animal2{
    String name = "哮天犬";
    final int num = 10;
    public abstract void eat();
    public void run(){

    }
    public Animal2(){
        System.out.println("我是抽象类构造方法");
    }

}
class Dog2 extends Animal2{
    public void barking(){
        System.out.println(name);
        System.out.println(num);
    }

    @Override
    public void eat() {

    }
}