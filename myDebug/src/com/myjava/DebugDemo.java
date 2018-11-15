package com.myjava;
/*
    断点调试的作用：
        A：查看程序执行流程；
        B：调试程序
    其实就是一个标记
    在哪里加断点？
        哪里不会哪里加断点
    如何加断点：
    左侧单击
    进入debug视图
    看那些区域?
        代码区域；
        debug区域；
        Variables:变量的变化
        Console：看程序的输入输出
    如何去掉断点？
     A： 左侧单击
     B：去除多个断点，在breakpoints中选中断点，
 */
public class DebugDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("c:"+c);
    }
}
