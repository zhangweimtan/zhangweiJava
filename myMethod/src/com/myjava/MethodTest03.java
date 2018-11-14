package com.myjava;
/*
    需求：写一个方法，在控制台输出十次“HelloWorld”
 */
public class MethodTest03 {
    public static void main(String[] args) {
//        调用helloWorld方法,单独调用
        helloWorld();

    }
//    写方法
    public static void helloWorld() {
        for(int x =0; x<10; x++){
            System.out.println("HelloWorld");
        }

    }
}
