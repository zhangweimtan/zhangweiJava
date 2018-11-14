package com.myjava;


/*
    写一个方法：把所有水仙花数打印在控制台
    明确：返回值类型 int
        参数列表 无
    方法调用：
    单独调用
    功能实现：
    a = (a/100)**3 + (a/10%10)**3 + (a%10)**3
 */
public class MethodTest05 {
    public static void main(String[] args) {
//        调用方法
        getFlowers();

    }
    public static void getFlowers() {
        for(int x = 100; x <1000; x++){
            int b = x/100;
            int s = x/10%10;
            int g = x%10;
            if(x == Math.pow(b,3) + Math.pow(s,3) + Math.pow(g,3)){
                System.out.println(x);
            }
        }
    }
}
