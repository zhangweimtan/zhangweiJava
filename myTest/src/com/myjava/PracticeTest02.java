package com.myjava;
/*
    需求：打印5位数中的所有回文数；
        举例，12321,是回文数，个位与万位相同，十位与千位相同
 */
public class PracticeTest02 {
    public static void main(String[] args) {
//        直接调用方法
        mirror();

    }
//    方法，返回值类型：？int? void
//    参数列表，类型int
    public static void mirror() {
        System.out.print("[");
        for (int a =10000; a < 100000; a ++) {
            int g = a % 10;
            int s = a /10 % 10;
            int q = a /1000 %10;
            int w = a /10000;
            if (g == w && s ==q) {
                if (a == 99999){
                    System.out.println(a+"]");
                }else {
                    System.out.print(a + ", ");
                }
            }
        }
    }
}
