package com.myjava;

import java.security.PublicKey;
import java.util.Scanner;

/*
    需求：在比赛中，有6个评委打分，分为0-100的整数分；
    选手的最后得分为：去掉一个最高分和一个最低分的4个评委平均分；
    请用代码实现。（不考虑小数部分）
    分析：
        键盘录入数据，0-100整数，6次；
        定义数组
        方法：遍历数组，找到最大值、最小值
        方法：定义求和变量
        调用方法
        输出平均数
 */
public class Test05 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
//        提示录入,for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数（0-100）：");
            arr[i] = sc.nextInt();
        }
//       调用方法
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
//        输出平均分
        int avg = (sum - max - min) / (arr.length -2);
        System.out.println("平均分："+avg);
    }
//        写方法 getMax();getMin()

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
//            比较
            if (max < arr[x]) {
                max = arr[x];
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
//            比较
            if (min > arr[x]) {
                min = arr[x];
            }
        }
        return min;
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }

}
