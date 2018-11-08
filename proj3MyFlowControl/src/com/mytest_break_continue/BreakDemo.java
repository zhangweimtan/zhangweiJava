package com.mytest_break_continue;
/*
    break:中断
    使用场景：
        A: switch语句
        B：循环中
    注意：
        离开使用场景，break是没有意义的
    用于结束循环
 */
public class BreakDemo {
    public static void main(String[] args) {
//        离开使用场景没有意义
//        break
        for (int x =1; x <=10; x++) {
            if(x == 3) {
                break;
            }
            System.out.println("HelloWorld");
        }
    }
}
