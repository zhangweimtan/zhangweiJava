package com.myjava;

import java.util.Scanner;

/*
    键盘录入两个数据，返回两个数中的较大值
 */
public class MethodTest01 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        接受第一个数据
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
//        接受第二个数据
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();
//        调用方法
        int res = getMax(a,b);
        System.out.println(res);
    }
//    写方法,返回较大值
    public static int getMax(int a, int b) {
//        if (a >b) {
//            return a;
//        }else {
//            return b;
//        }
        int c = (a > b)?a:b;
        return c;

    }
}
