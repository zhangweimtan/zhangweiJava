package com.myjava01;

public class AbstractDemo {
}
/*抽取重复，不仅是方法重复，还有描述的重复
    abstract 关键字，用于修饰方法和类
    抽象方法：
    不同类的方法是相似的，但是具体内容又不太一样，所以我们只能抽取他的声明，没有具体的方法体，没有具体的方法体的方法就是抽象方法
    抽象类：有抽象方法的类必须是抽象类，
    注意：一个类继承抽象类，必须重写所有的抽象方法
        否则这个类，也是抽象类
*/
abstract class Animal{
    public abstract void eat();
    //    非抽象子类可以不重写
    public void run(){

    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
abstract class Dog extends Animal{
//    public void eat(){
//        System.out.println("狗吃肉");
//    }
}
