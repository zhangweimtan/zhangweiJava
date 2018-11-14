package com.myjava_02;
/*
    比较两个数据是否相等；参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试
 */
public class MethodTest {
    public static void main(String[] args) {
//        定义变量
       int a = 10;
       int b = 20;
        System.out.println(compare((long)a,(long)b));


    }
//    写入方法
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(int a, int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean compare(short a, short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean compare(long a, long b){
        System.out.println("long");
        return a==b;
    }

}
