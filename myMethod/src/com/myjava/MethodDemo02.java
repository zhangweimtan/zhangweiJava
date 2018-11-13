package com.myjava;
/*
    方法调用
    在man方法里调用
    有明确返回值的方法调用
    单独调用：没有意义
    一般很少调用
    输出调用：因为我可能需要拿结果进行其他操作
    赋值调用：推荐方式，

 */
public class MethodDemo02 {
    public static void main(String[] args) {
//        单独调用，无意义
//        sum(10, 20)
//        输出调用，有意义
//        System.out.println(sum(10,20));
//        赋值调用,
        int res = sum(10,20);
        System.out.println(res);
    }
//    求和方法：
//    明确：
//    返回值类型：int
//    参数列表：int a, int b;
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

}
