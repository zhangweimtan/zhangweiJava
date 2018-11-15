package com.myjava;
/*
    看循环执行流程
    1-5求和案例
    断点必须加在有效语句上
 */
public class DebugTest {
    public static void main(String[] args) {
//        定义求和变量
        int sum = 0;
//        获取1-5数据
        for (int x =1; x<6; x++) {
            sum += x;
        }
        System.out.println("sum:"+sum);
    }
}
