package com.myjava;
/*
    定义两个数组，分别输出数组名和元素，然后赋值，再次输出数组名和元素
 */
public class ArrayTest02 {
    public static void main(String[] args) {
//        定义数组
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
//        输出数组名和元素
        System.out.println("arr1:"+arr1);
        System.out.println("arr2:"+arr2);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
//        赋值
        arr1[0] = 100;
        arr1[2] = 200;
        arr2[0] = 102;
        arr2[1] = 203;
        arr2[2] = 303;
//        再次输出数组名和元素
        System.out.println("arr1:"+arr1);
        System.out.println("arr2:"+arr2);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
