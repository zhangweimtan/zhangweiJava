package com.mytest_break_continue;
/*
    求1-100内偶数的和
 */
public class ContinueTest {
    public static void main(String[] args) {
//        定义变量,求和变量
        int i;
        int sum = 0;
        for (i =1; i <=100; i++) {
//            跳过奇数
            if (i%2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum:"+sum);
    }
}
