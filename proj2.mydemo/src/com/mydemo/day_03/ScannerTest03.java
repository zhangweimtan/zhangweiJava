package com.mydemo.day_03;

import java.util.Scanner;
/*
    键盘输入三个数据对象，并确定最大值
 */
public class ScannerTest03 {
    public static void main(String[] args) {
//        键盘录入对象
        Scanner sc = new Scanner(System.in);
//        第一个数据，提示
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
//        第二个
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
//        第三个
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();
//        三元逻辑运算，比较大小
        int temp = (a>b)?a:b;
        int max = (temp>c)?temp:c;
        System.out.println("max:"+max);
    }
}
