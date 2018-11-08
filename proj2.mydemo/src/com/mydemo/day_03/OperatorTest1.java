package com.mydemo.day_03;
/*
    获取三个整数的最大值，测试：

 */
public class OperatorTest1 {
    public static void main(String[] args) {
//        变量
        int a = 5;
        int b = 6;
        int c = 8;
//        先获取两个最大值，再与第三个比较
        int temp = (a > b)?a:b;
        int max = (temp > c)?temp:c;
        System.out.println("max:"+ max);
    }
}
