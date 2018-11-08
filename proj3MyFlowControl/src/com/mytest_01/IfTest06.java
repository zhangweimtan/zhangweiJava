package com.mytest_01;


import java.util.Scanner;

/*
    输入成绩判断：
    90-100，优秀
    70-90，良好
    60-70， 及格
    0-60， 不及格
 */
public class IfTest06 {
    public static void main(String[] args) {
//        创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        int a = sc.nextInt();
        if(a>=90 && a<=100) {
            System.out.println("优秀");
        }else if(a>=70 && a<90) {
            System.out.println("良好");
        }else if(a>=60 && a<70) {
            System.out.println("及格");
        }else if(a>=0 && a < 60){
            System.out.println("不及格");
        }else {
            System.out.println("成绩输入错误！");
        }

    }
}
