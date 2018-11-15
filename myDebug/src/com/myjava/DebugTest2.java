package com.myjava;

import java.util.Scanner;

/*
    看方法的调用流程
    求和方法的调用
    带有录入数据的如何看执行流程
 */
public class DebugTest2 {
    public static void main(String[] args) {
//        创建键盘对象
        Scanner sc = new Scanner(System.in);
//        提示录入数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
//        调用方法
        int sum = sum(a,b);
        System.out.println("sum:"+sum );
    }
//    求和方法
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
