package com.myjava;
/*
    java继承特定：
        Java语言只支持单一继承，只能继承一个父类
 */

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Lol l = new Lol();
        l.update();
        l.start();
    }
}

class Game1{
    public void start(){
        System.out.println("游戏启动了");
    }
}

class PCGame extends Game1{
    public void update(){
        System.out.println("PCGame更新了");
    }
}
class MobileGame extends Game1{
    public void update(){
        System.out.println("MobileGame更新了");
    }
}

class Lol extends PCGame{

}


