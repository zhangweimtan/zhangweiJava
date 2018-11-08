package com.mytest_02;

import java.util.Scanner;

/*
    switch格式：
        switch(表达式) {
        case 值1：
            语句体1；
            break;
        case 值2：
            语句体2；
            break；
            。。。。
        default:
            语句体n+1;
            break;
    格式解释：
        表达式：byte,short int char
            JDK5以后可是枚举
            JDK7以后可是字符串
        case后面的值：就是用来和表达式的值匹配的内容
        break：中断；
        default：所有的值都不匹配时候，就执行default  //else
    执行流程：
        A：首先计算表达式的值
        B：依次与case后面的值比较，一旦匹配，就执行对应的语句体，遇到break就结束；
        C: 所有case都不匹配，default，执行语句体n+1;
 */
public class SwitchTest01 {
    public static void main(String[] args) {
//        创建键盘对象
        Scanner sc = new Scanner(System.in);
//        接受数据，并提示
        System.out.println("请输入数字（1-7）：");
        int weekday = sc.nextInt();
//        switch语句
        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error..");
        }
    }
}
