package com.mytest_for_03;
/*
    求1-100的偶数之和
    分析：
        首先定义初始求和值，int sum=0；
        for循环中初始值 int x=2
        判断x<=100,x+=2;
        循环体 sum += x;
        最后输出sum
 */
public class ForTest03 {
    public static void main(String[] args) {
//        定义求和变量
        int sum = 0;
//        for(int x =2; x<=100; x+=2) {
//            sum += x;
//        }
        for(int x=1; x<=100; x++){
            if(x%2 == 0){
                sum += x;
            }
        }
        System.out.println("sum="+sum);
    }
}
