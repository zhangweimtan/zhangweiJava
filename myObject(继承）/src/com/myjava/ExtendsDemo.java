package com.myjava;
/*
    继承：多个类有共同的成员变量和成员方法，抽取到另外一个类中（父类），让多个类继承这个父类，我们多个类就可以获取到父类中的成员了，
    extends,



 */
public class ExtendsDemo {
    public static void main(String[] args) {
        DotA d = new DotA();
        d.start();
        LoL l = new LoL();
        l.start();
    }
}

class Game{
    String name;
    double version;//版本号
    String agent;//代理商
    public void start(){
        System.out.println("游戏启动了");
    }
    public void stop(){
        System.out.println("游戏结束了");
    }
}

class DotA extends Game{

}

class LoL extends Game{

}