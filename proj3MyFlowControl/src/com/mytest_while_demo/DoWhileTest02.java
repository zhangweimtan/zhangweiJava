package com.mytest_while_demo;
/*
    求和1-100
 */
public class DoWhileTest02 {
    public static void main(String[] args) {
//        定义求和变量
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i ++;
        } while(i <=100);
        System.out.println("sum:"+sum);
    }
}
