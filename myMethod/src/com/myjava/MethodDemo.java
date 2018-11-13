package com.myjava;
/*
    方法：其实就是完成特定功能的代码块
    格式：
        首先是修饰符 返回值类型 方法名（参数类型，参数名1，参数类型，参数2，...) {
            方法体；
            return 返回值；
            }
    解释格式：
        A：修饰符 目前记住 public static
        B: 返回值类型 用于限定返回值数据类型
        C：方法名，为了方便调用方法的名字
        D: 参数类型，数据类型，用于限定调用方法时，传入数据的类型
        E：参数名，用于接收调用方法时，传入数据的变量
        F： 方法体，完成功能的代码
        G：return 返回值，return：结束方法，并且把返回值递给调用者
    注意点：
        A：明确返回值类型，明确功能结果的数据类型
        B：参数列表，明确有几个参数，以及参数的数据类型
    案例：
        写一个方法用去求和
 */
public class MethodDemo {
    public static void main(String[] args) {

    }
//    返回类型 int
//    参数列表 int a, int b
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

}
