package com.myjava_03;
/*
    方法的参数：
    实际参数，形式参数，互不影响

 */
public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a +"b:"+b);// main 方法
        change(a,b); // change 方法
        System.out.println("a:"+a +"b:"+b);//main 方法
    }
    public static void change(int a, int b) {
        System.out.println("a:"+a +"b:"+b);//接受（继承）main方法中的参数
        a = b;
        b = a + b;
        System.out.println("a:"+a +"b:"+b);
    }
}
