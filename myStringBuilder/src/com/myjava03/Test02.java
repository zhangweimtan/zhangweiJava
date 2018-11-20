package com.myjava03;
/*
    把数组拼接成一个字符串
    int[] arr = {1,2,3}
    结果：
    [1, 2, 3]
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        调用方法
        String s = arrayToString(arr);
        System.out.println(s);
    }
//    方法：返回值类型String；参数列表int[] arr;
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x=0; x<arr.length; x++){
            if(x == arr.length-1){
                sb.append(arr[x]).append("]");
            }else{
                sb.append(arr[x]).append(", ");
            }
        }
        String res = sb.toString();
        return res;
    }
}
