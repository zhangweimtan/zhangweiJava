package com.mytest_while_demo;
/*
    do while循环语句格式：
        do{
        循环体语句；
        }while（判断条件语句）；
    扩展格式：
        初始化语句；
        do{循环体语句；
            控制条件语句；
            }while（判断条件语句）；
    执行流程：
        A：执行初始化语句；
        B：执行循环体语句；
        C： 执行控制条件语句；
        D：执行判断条件语句，看true or false
            false，结束；true回到B

 */
public class DoWhileTest {
    public static void main(String[] args) {
//        控制台输出10此HelloWorld
//        for 循环
//        for (int x =1; x<=10; x ++) {
//            System.out.println("HelloWorld");
//        }
//        do while循环
        int i = 1;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 10);
    }
}
