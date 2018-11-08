package com.mytest_01;

import java.util.Scanner;
/*
    If-else if -else 扩展
 */
public class IfTest04 {
    public static void main(String[] args) {
        System.out.println("start");
//        define varies
//        x , y的关系满足如下：
//        x >=3, y = 2x +1;
//        -1<=x<3, y = 2x;
//        x<-1, y = 2x -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();
        int b;
        if(a >= 3) {
            b = a*3 +1;
            System.out.println("结果是："+b);
        }else if(a < 3 & a >=-1) {
            b = a*3;
            System.out.println("结果是："+b);
        }else {
            b = a*3 -1;
            System.out.println("结果是："+b);
        }
        System.out.println("end");
    }
}
