package com.myjava;

import java.util.Scanner;

/*
    键盘录入月份，输出对应季节。
    一年四季：
    3,4,5春季
    6-8夏季
    9-11秋季
    12-2冬季
 */
public class PracticeTest01 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        提示录入
        System.out.println("请输入月份（1-12）");
        int a = sc.nextInt();
//        调用方法
        season(a);
    }
//    写方法
    public static void season(int a){
        if (a >2 && a< 6) {
            System.out.println("春季");
        }else if (a >5 && a < 9) {
            System.out.println("夏季");
        }else if(a >8 && a <12){
            System.out.println("秋季");
        }else if(a==12|| (a>0 && a<3 )){
            System.out.println("冬季");
        }else {
            System.out.println("错误月数！");
        }
    }

}
