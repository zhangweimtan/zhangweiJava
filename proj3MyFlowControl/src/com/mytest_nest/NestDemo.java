package com.mytest_nest;
/*
    嵌套循环：
    常见的for循环中嵌套for循环
        for(初始化语句；判断条件语句；控制条件语句) {
            for(初始化语句；循环条件语句；控制条件语句）{
                执行语句
                }
        }
 */
public class NestDemo {
    public static void main(String[] args) {
//        定义两个循环变量
        int i, j;
//        外循环
        for (i= 1; i <=8; i++) {
            for (j =1; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
