package com.mytest_for_03;
/*
    for循环语句的格式：
        for(初始化语句；判断条件语句；控制语句）｛
        循环体语句
        ｝
    执行流程：
        A：执行初始化语句，
        B：执行判断条件语句，看结果是true还是false
            如果是false，就结束循环
            如果是true，就继续执行
        C：执行循环体语句
        D：执行控制条件语句
        E：回到B继续
 */
public class ForDemo {
    public static void main(String[] args) {
//        控制台输出10次HelloWorld的案例
        for(int x = 1; x<=10; x++) {
            System.out.println("HelloWorld");
        }

    }
}
