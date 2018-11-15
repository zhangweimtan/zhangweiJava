package com.myjava;
/*
    需求：
        （1）定义一个int类型的数组：内容为｛171,72,19,16,118,51,210,7,18｝
        （2）求出该数组中满足要求的元素和。
        要求：元素个位和十位不包含7，且只能为偶数。
        分析：定义数组
        定义求和变量
        遍历数组
 */
public class Test04 {
    public static void main(String[] args) {
//        定义数组
        int[] arr ={171,72,19,16,118,51,210,7,18};
//        定义求和变量
        int sum = 0;
        for (int x=0; x<arr.length; x++) {
            int g = arr[x]%10;
            int s = arr[x]/10%10;
            if (g !=7 && s !=7 && arr[x]%2==0) {
                sum += arr[x];
            }
        }
        System.out.println("sum:"+sum);

    }
}
