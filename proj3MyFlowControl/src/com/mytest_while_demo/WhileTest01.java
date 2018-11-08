package com.mytest_while_demo;
/*
    求1-100之间的和
    联系水仙花数的个数
 */
public class WhileTest01 {
    public static void main(String[] args) {
//        定义初始值
        int sum = 0;
        int x = 1;
        while(x <= 100) {
            sum += x;
            x++;
        }
        System.out.println("sum:"+sum);

    }
}
