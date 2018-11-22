package com.myjava01;
/*
    需求：写一个两个数的和的方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("sum:"+sum(a,b));
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
