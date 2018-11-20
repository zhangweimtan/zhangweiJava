package com.myjava03;

import java.util.Scanner;

/*
    判断一个字符串是否是对称字符串
    例如，“abc"不是对称字符串，"aba","abba","aaa",

    分析：
        A：键盘录入一个字符串
        B：写方法实现判断一个字符串是否对称字符串
            把字符串反转，和反转钱的字符串比较，如果内容相同，就说明是对称字符串
        C：调用方法
        D：输出结果
 */
public class Test04 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
//        调用方法
        boolean b = isSymmetry(s);
        System.out.println("结果"+b);
    }
//    注意：返回值类型：boolean，参数列表：String s
    public static boolean isSymmetry(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s.equals(s1);
    }
}
