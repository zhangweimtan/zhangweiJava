package com.mydemo.day_03;

import java.util.Scanner;
/*
    键盘录入两个数字，比较两个数字是否相等
 */
public class ScannerTest01 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);

//        接受数据
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();

        System.out.println("请输入第二数字：");
        int b = sc.nextInt();
//        比较数据相等
//        boolean flag = (a == b)?true:false;
        boolean flag = (a == b);
        System.out.println("flag:"+flag);
    }
}
