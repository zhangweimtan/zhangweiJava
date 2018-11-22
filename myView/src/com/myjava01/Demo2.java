package com.myjava01;
/*
    定义一个元素类型为int的数组，遍历数组并求和
 */
public class Demo2 {
    public static void main(String[] args) {
//        静态数组
        int[] arr = {1,2,3,4,5};
//        定义求和变量
        int sum = 0;
        for (int x=0; x<arr.length; x++){
            sum += arr[x];
        }
        System.out.println("sum:"+sum);
    }
}
