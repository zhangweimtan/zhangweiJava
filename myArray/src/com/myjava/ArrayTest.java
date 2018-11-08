package com.myjava;
/*
    输出数组名及元素，然后给数组中的元素赋值，再次输出数组名及元素
 */
public class ArrayTest {
    public static void main(String[] args) {
//        定义数组
        int[] arr = new int[3];
        System.out.println("arr:"+arr);
        System.out.println(arr[0]);
//        给数组中元素赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("arr:"+arr);
    }
}
