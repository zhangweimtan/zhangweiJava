package com.mytest_while_demo;
/*
    求水仙花个数
    水仙花：个位立方+十位立方+百位立方=数字本身
 */
public class WhileTest02 {
    public static void main(String[] args) {
//        定义初始值
        int i = 100;
        int count = 0;
//        while loop
        while (i < 1000) {
            int b = i / 100;
            int s = i / 10 % 10;
            int g = i % 10;
            if(i == b*b*b +s*s*s + g*g*g){
                count += 1;
            }
            i ++;
        }
//        for loop
//        for (int i =100; i<1000; i++) {
//            int b = i / 100;
//            int s = i / 10 % 10;
//            int g = i % 10;
//            if(i == b*b*b + s*s*s + g*g*g ) {
//                count += 1;
//            }
//        }
        System.out.println("count:"+count);
    }
}
