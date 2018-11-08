package com.mytest_while_demo;
/*
    三种循环的区别：
        A: do while 循环至少执行一次；
        B：for while 循环必须判断条件成立
    for 与 while：
        for内变量仅只在{}有效，之外不可用；
        while的变量初始值，main内可以引用的；
 */
public class LoopDemo {
    public static void main(String[] args) {
//        for循环
        for (int x = 1; x <=3; x++) {
            System.out.println("I o java!");
        }
        System.out.println("----------");
//        System.out.println(x);
//        while循环
        int y = 1;
        while (y <= 3) {
            System.out.println("I o java!");
            y ++;
        }
        System.out.println(y);
    }
}
