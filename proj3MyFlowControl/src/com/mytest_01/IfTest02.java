package com.mytest_01;
/*
    if-else语句
    if(关系表达式）{
    语句体1}else{
    语句体2}
    执行流程：
        A： 关系表达式 true or false
        B : true 执行语句体1
        C： false 执行语句体2

 */
public class IfTest02 {
    public static void main(String[] args) {
        System.out.println("开始");
//        定义变量
        int a = 10;
        int b = 20;
        if(a > b) {
            System.out.println("max:"+a);
        }else {
            System.out.println("max:"+b);
        }
        System.out.println("结束");
    }
}
