package com.myjava;

import java.util.Scanner;

/*
    需求：
    （1）键盘录入5个数据，存入arr数组中
    （2）定义方法将arr数组中内容反转
    分析：定义1个临时变量int i =0
    int a = arr[i] + arr[arr.length -1-i];
    arr[i] = arr[arr.length -1-i];
    arr[arr.length -1-i] = a - arr[i];

    （3）定义方法对反转数组遍历
 */
public class Test06 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        定义数组
        int[] arr = new int[10];
//        录入数据
        for (int x =0; x<arr.length; x++){
            System.out.println("请输入"+(x+1)+"数据：");
            arr[x] = sc.nextInt();
        }
//        调用方法-反转
        reverse(arr);
//        遍历新数组
        printArr(arr);

    }
    public static void reverse(int[] arr) {
        int x = arr.length-1;
        for (int i=0; i <=x/2; i++) {
            int a = arr[i];
            int b = arr[x-i];
            arr[i] = b;
            arr[x - i] = a;
        }
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i =0; i < arr.length; i++){
            if(i < arr.length-1){
                System.out.print(arr[i]+", ");
            }else {
                System.out.println(arr[i] + "]");
            }
        }

    }
}
