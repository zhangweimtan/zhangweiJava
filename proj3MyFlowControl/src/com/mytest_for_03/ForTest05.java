package com.mytest_for_03;

import com.sun.org.apache.xpath.internal.SourceTree;

/*
    统计水仙花数
    分析：
        定义求和变量 sum
        for 循环找出水仙花数，
        sum += 1；
        最后输出sum；
 */
public class ForTest05 {
    public static void main(String[] args) {
//        定义求和变量
        int sum = 0;
        for(int x =100; x >=100 && x < 1000; x++) {
            if(x == (x/100)*(x/100)*(x/100) + (x/10%10)*(x/10%10)*(x/10%10) + (x%10)*(x%10)*(x%10)) {
                sum += 1;
            }
        }
        System.out.println("水仙花数是："+sum);
    }
}