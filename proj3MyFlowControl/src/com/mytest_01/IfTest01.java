package com.mytest_01;
/*
    选择结构 if语句
        if(关系表达式）｛
            语句体
        ｝
    执行流程：
        A ： 首先计算关系表达式，true or false
        B ： true执行语句体，false不执行语句体
 */
public class IfTest01 {
    public static void main(String[] args) {
        System.out.println("开始");
//        定义两个变量
        int a = 10;
        int b = 20;
        if(a > b) {
            System.out.println(a);
        }
//        定义变量
        int c = 10;
        if(a ==c) {
            System.out.println("ok");
        }
        System.out.println("结束");
    }
}
