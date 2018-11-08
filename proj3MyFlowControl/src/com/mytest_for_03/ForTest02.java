package com.mytest_for_03;
/*
    求出1-5之间的数据之和
    分析：
        A：定义求和变量，初始化值=0
        B：获取1-5的数据
        C：每次获取到的数据累加即可
        D：输出求和变量
 */
public class ForTest02 {
    public static void main(String[] args) {
//        定义求和变量
        int sum = 0;
        for(int x =1; x<=10000; x++) {
//            sum = sum +x;
            sum += x;
        }
        System.out.println("sum="+sum);
    }
}
