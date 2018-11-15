package com.myjava;

import java.util.Scanner;

/*
    需求：键盘录入4位整数，进行加密；
        每个数字加上5，然后%10代替该数字；
        再将第一位和第四位交换，第二位第三位交换；
        再把加密后的数字输出控制台；
 */
public class Test08 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        提示
        System.out.println("请输入四位数字：");
        int a = sc.nextInt();
//        定义数组
        int[] arr = {a/1000,a /100%10,a /10%10,a %10};
//        调用加密方法，并输出
        lock(arr);
    }
//    注意：返回值 void,参数列表 int[] arr
    public static void lock(int[] arr){
        for (int x =0; x<arr.length; x++) {
//            每个数字加上5，然后%10代替该数字；
            arr[x] = (arr[x]+5)%10;
        }
        for (int x =0, i= arr.length-1; x<=i; x++,i--){
//            再将第一位和第四位交换，第二位第三位交换；
            int temp = arr[x];
            arr[x] = arr[i];
            arr[i] = temp;
        }
//        输出新数据
        System.out.print("新数据：");
        for (int x =0; x<arr.length; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }
}
