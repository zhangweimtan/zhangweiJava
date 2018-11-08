package com.mytest_while_demo;
/*
    while 循环的语句格式：
        while(判断条件语句）{
            循环体语句
        }
    扩展版格式：
        初始化语句；
        while(判断条件语句）{
            循环体语句；
            控制条件语句；
        }
    回顾for循环；
        for(初始化语句；判断语句；控制条件语句）{
        循环体语句
        }
    while执行流程：

 */
public class WhileDemo01 {
    public static void main(String[] args) {
//        在控制台输出10此HelloWorld
//        for(int x =1; x<=10; x++) {
//            System.out.println("HelloWorld");
//        }
        int i = 1;
        while(i <= 10) {
            System.out.println("HelloWorld");
            i++;
        }
    }
}
