package com.myjava_04;

import java.lang.reflect.AnnotatedType;

/*
    把获取数组最值改进为方法实现，并调用方法
 */
public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr = {11,22,313,44,55};
//        输出调用
        int max = getMaxArr(arr);
        System.out.println("Max:"+max);
    }
//    改进方法：
//    返回值类型：int
//    参数类型 int[] arr
    public static int getMaxArr(int[] arr) {
        int max = arr[0];
        for (int x=1; x<arr.length;x++) {
            if (max < arr[x]){
                max = arr[x];
            }
        }
        return max;
    }

}
