package com.myjava;

import java.util.Random;
import java.util.Scanner;

/*
    随机数猜谜游戏
    1-10内随机数，才这个数据是多少
    实现步骤：
        A： n = r.nextInt(10)+1；
        B： 键盘录入数据；
        C: 比较两个数据
 */
public class RandomTest02 {
    public static void main(String[] args) {
//        创建随机对象
        Random r = new Random();
        int n = r.nextInt(10) + 1;
//        创建键盘录入对象
        Scanner s = new Scanner(System.in);
//      while 循环控制，猜中break
        while (true) {
//           提示输入数据
            System.out.println("请输入数据：");
            int i = s.nextInt();
            if (i > n) {
                System.out.println("Bigger!");
            } else if (i < n) {
                System.out.println("Lower!");
            } else {
                System.out.println("Exactly!");
                break;
            }

        }
    }
}
