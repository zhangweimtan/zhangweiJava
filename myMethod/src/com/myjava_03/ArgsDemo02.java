package com.myjava_03;
/*
    如果参数是引用数据类型，
    形式参数的改变直接影响实际参数
    数组不同于赋值，引用（指向）内存空间
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int x =0; x <arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("---------");
        change(arr);
        for (int x =0; x <arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
    public static void change(int[] arr) {
        for (int x =0; x<arr.length; x++) {
            if (arr[x]%2 == 0) {
                arr[x] *= 2;
            }
        }
    }
}
