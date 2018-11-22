package com.myjava03;

public class MyArrays {
    private MyArrays(){}
        /*
        返回数组中最大值
         */
    public static int getMax(int[] arr){
        int max = 0;//参照物
        for (int x=0; x<arr.length; x++){
            if (max < arr[x]){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getIndex(int[] arr, int a){
        for(int x=0; x<arr.length; x++){
            if(a == arr[x]){
                return x;
            }
        }
        return -1;//查不到，返回-1
    }

}
