package com.mytest_break_continue;
/*
    continue:
        使用场景：
            循环
       注意：
       离开使用场景没有意义
       结束一次循环，继续下一次循环
 */
public class ContinueDemo {
    public static void main(String[] args) {
//        单独使用continue，没有意义
//        continue
//        结束x == 3 的循环体
        for (int x =1; x <=10; x++) {
            if(x == 3) {
                continue;
            }
            System.out.println("HelloWorld:"+x);
        }
    }
}
