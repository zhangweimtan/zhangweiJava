package com.myjava;

import java.util.Random;

/*
    Random:
    用于产生随机数
    使用步骤：
        A: 导包；
            import java.utl.Random;
        B： 创建对象；(alt+enter)自动导包
            Random r = new Random();

        C： 产生随机数(获取数据的范围，[0-10)之间）
            int num = r.nextInt(10);
 */
public class RandomDemo {
    public static void main(String[] args) {
//        创建对象
        Random r = new Random();
//        获取随机数
        for (int x=1; x <=10; x++) {
            int n = r.nextInt(10);
            System.out.println("num:" + n);
        }
    }
}
