package com.myjava;

import java.util.Scanner;

/*
    需求：
        数组元素查找（查找指定元素在数组中第一次出现的索引；
        （1）给定数组int[] arr = {5,7,3,2,5}
        (2) 查找的元素通过键盘录入
        （3）定义一个方法，查找索引，元素就是录入的数据
 */
public class Test07 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        提示
        System.out.println("请输入需要查找元素：");
        int a = sc.nextInt();
//        定义数组
        int[] arr = {5, 7, 3, 2, 5};
//        调用方法
        int res = search(arr, a);
        System.out.println(a + "的索引是：" + res);

    }

    //    查找方法，返回值 int；参数列表，int[] arr, int a;
    public static int search(int[] arr, int a) {
        for (int x = 0; x < arr.length; x++) {
            if (a == arr[x]) {
                return x;
            }
        }
        return -1; //不存在元素返回-1
    }
}