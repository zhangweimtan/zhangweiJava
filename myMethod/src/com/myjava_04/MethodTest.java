package com.myjava_04;
/*
    把遍历数组改进为方法实现，并调用方法
 */
public class MethodTest {
    public static void main(String[] args) {
//        定义一个数组
        int[] arr = {11,22,33,44,55};
//        遍历数组
//        for (int x =0; x <arr.length; x++) {
//            System.out.println(arr[x]);
//        }
        printArr(arr);
    }
//    用方法改进 [11, 22, 33, 44, 55]
//    两个明确：返回值类型：void
//              参数列表；int[] arr
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int x =0; x <arr.length; x++) {
            if (x == arr.length-1) {
                System.out.println(arr[x]+"]");
            }else {
                System.out.print(arr[x]+", ");
            }
        }
    }
}
