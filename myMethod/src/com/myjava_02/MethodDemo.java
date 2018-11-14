package com.myjava_02;
/*
    方法重载
    在同一个类中，出现了方法名相同的情况
    特点：
        方法名相同；
        参数列表不同；参数的个数不同；参数对应的数据类型不同
    注意：
        在调用方法的时候，Java虚拟机会通过参数列表的不同来区分同名的方法
 */
public class MethodDemo {
    public static void main(String[] args) {
//        定义列表
        int a = 10;
        int b = 20;
        int c = 30;
//        调用方法
        int res1 = sum(a,b);
        int res2 = sum(a,b,c);
        System.out.println(res1);
        System.out.println(res2);
    }
//    写入方法
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}
