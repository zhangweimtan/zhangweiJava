package com.mytest_while_demo;
/*
    统计水仙花个数
 */
public class DoWhileTest03 {
    public static void main(String[] args) {
//        定义统计变量
        int count = 0;
        int i = 100;
        do {
            int g = i % 10;
            int s = i /10 % 10;
            int b = i / 100;
            if(i == Math.pow(g,3) +Math.pow(s,3) + Math.pow(b,3)) {
                count += 1;
                System.out.println(i);
            }
            i ++;
        } while (i < 1000);
        System.out.println("count:"+count);
    }
}
