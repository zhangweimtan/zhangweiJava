package com.mytest_01;

import java.util.Scanner;

/*
    键盘录入两个数据，获取较大值
    A：键盘录入的三个步骤
        import java.util.Scanner;导包
        Scanner sc = new Scanner(System.in);创建对象
        int a = sc.nextInt();接受数据
   导包：手动，创建对象时自动生成(alt enter)，快捷键（推荐）
        ctrl shift o
 */
public class IfTest05 {
    public static void main(String[] args) {
//        创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();
//        判断a ,b 大小
        if(a >b) {
            System.out.println("max:"+a);
        }else {
            System.out.println("max:"+b);
        }
    }
}
