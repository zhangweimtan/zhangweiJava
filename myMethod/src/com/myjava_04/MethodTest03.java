package com.myjava_04;
/*
    写一个方法，用于对数组求和，并调用方法
 */
public class MethodTest03 {
    public static void main(String[] args) {
        //    定义数组
        int[] arr = {1,2,3,4,5};
////        定义求和变量
//        int sum = 0;
////        遍历数组依次求和
//        for (int x=0; x<arr.length;x++) {
//            sum += arr[x];
//        }
        int sum = sum(arr);
        System.out.println("sum:"+sum);
    }
//    方法实现
    public static int sum(int[] arr){
//        定义求和变量
        int sum = 0;
//        遍历数组依次求和
        for (int x=0; x<arr.length;x++) {
            sum += arr[x];
        }
        return sum;
    }

}
