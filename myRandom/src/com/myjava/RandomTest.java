package com.myjava;

import java.util.Random;

/*
    Random随机数，break
 */
public class RandomTest {
    public static void main(String[] args) {
//        创建对象
        Random r = new Random();
//        int sum = 0;
        for (int x =1; x <=10; x++) {
            int n = r.nextInt(10);
            if(n%2 !=0) {
                continue;
            }
            System.out.println("i o java!"+x);
        }
//        System.out.println("sum:"+sum);
    }
}
