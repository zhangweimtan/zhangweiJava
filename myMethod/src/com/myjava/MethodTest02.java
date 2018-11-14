package com.myjava;

import java.util.Scanner;

/*
    键盘录入三个数据，返回最大值
 */
public class MethodTest02 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        提示输入第1个数据
        System.out.println("输入第1个数据：");
        int a = sc.nextInt();
        //        提示输入第2个数据
        System.out.println("输入第2个数据：");
        int b = sc.nextInt();
        //        提示输入第3个数据
        System.out.println("输入第3个数据：");
        int c = sc.nextInt();
//        调用getMax方法
        int res = getMax(a, b, c);
        System.out.println("max is: "+res);
    }
//    创建方法，实现返回最大值的功能
    public static int getMax(int a, int b, int c) {
        int temp = (a > b)?a:b;
        int max = (temp > c)?temp:c;
        return max;
    }
}
