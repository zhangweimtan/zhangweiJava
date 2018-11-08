package com.mytest_break_continue;
/*
    break and continue demo:
    run break and continue

 */
public class BreakAndContinueDemo {
    public static void main(String[] args) {
//        按例题分析，并验证
        for (int x =1; x <=10; x++) {
            if (x%3 == 0) {
//                分别写入break，continue，看输出结果
                continue;
            }
            System.out.println("I o java!"+x);
        }
//        break,run to 3 stop loop;
//        continue run to 3,6,9,jump out of loop;
    }
}
