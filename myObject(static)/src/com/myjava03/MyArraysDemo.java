package com.myjava03;
/*
    定义工具类，用static写，不需要创建对象，不需要成员变量，有点类似方法
 */
public class MyArraysDemo {
    public static void main(String[] args) {
        int[] arr = {3,5,7,11};
        int max = MyArrays.getMax(arr);
        System.out.println(max);

        int index = MyArrays.getIndex(arr,5);
        System.out.println(index);

    }
}
