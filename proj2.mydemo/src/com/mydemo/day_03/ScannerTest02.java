package com.mydemo.day_03;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
/*
    键盘录入两个数据，并对两个数据求和，输出结果
 */
public class ScannerTest02 {
    public static void main(String[] args) {
//        键盘输入对象
        Scanner sc = new Scanner(System.in);
//        接受第一个数据对象
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
//        第二个数据对象
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
//        求和
        int flag = a + b;
        System.out.println("之和:"+ flag);

    }
}
