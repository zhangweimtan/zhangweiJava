package com.myjava;

import java.util.Scanner;

/*
    需求：写一个方法，传递一个整数（大于1），在控制台打印1到该数据的值
    明确：返回值 类型 void
    参数列表：int n
    void单独调用
 */
public class MethodTest04 {
    public static void main(String[] args) {
//      创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        提示输出一个整数（大于1）
        System.out.println("请输入一个大于1的整数！");
        int a = sc.nextInt();
//        其实这是另外一个方法
        if (a < 1) {
            System.out.println("error number given!");
            System.out.println("请输入一个大于1的整数！");
            int b = sc.nextInt();
            printNum(b);
        } else {
            printNum(a);
        }

    }

    //    写方法1
    public static void printNum(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
//        写方法2
//    public static void reNum() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("error number given!");
//        System.out.println("请输入一个大于1的整数！");
//        int b = sc.nextInt();
//        printNum(b);
//        }
    }
}
