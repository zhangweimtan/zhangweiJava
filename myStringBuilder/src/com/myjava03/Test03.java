package com.myjava03;

import java.util.Scanner;

/*
    把字符串反转
       分析：
        A：键盘录入一个字符串
        B：写一个方法实现反转
 */
public class Test03 {
    public static void main(String[] args) {
//        创建键盘对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
//        调用反转方法
        String rs = reverse(s);
        System.out.println("反转后字符："+rs);
    }
//         注意：返回值类型，String;参数列表：String s
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;
    }
}
