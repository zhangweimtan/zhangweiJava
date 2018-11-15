package com.myjava;
/*
    需求：不死神兔问题
        有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第二十个月的兔子对数为多少？
    分析：通过递归发现规律，1,1,2,3,5.。。
        A：数据较多，用数组来实现，长度为21
 */
public class PracticeTest03 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
//        arr[2] = arr[1] + arr[0]
        for (int x =2; x <arr.length; x++) {
            arr[x] = arr[x-1] + arr[x-2];
        }
        System.out.println("第20个月兔子："+arr[19]);

    }
}
