package com.myjava02;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

/*
    给定一个字符串数组：｛"张三","李四","王五","张大炮","张小四"}，将数组中的元素添加到结合中，并将所有姓张的输出到控制台
 */
public class Test02 {
    public static void main(String[] args) {
//        创建数组对象
        String[] arrS = {"张三","李四","王五","张大炮","张小四"};
//        创建集合对象
        ArrayList<String> array = new ArrayList<>();
//        调用方法
        match(arrS, array);
    }
//    写方法：返回值，void，参数列表，String[] s, ArrayList<String> array
     public static void match(String[] s, ArrayList<String> array){
        for (int x=0; x<s.length; x++){
            array.add(s[x]);
        }
        for(int x=0; x<array.size();x++){
            String s1 = array.get(x);
            if (s1.startsWith("张")){
                System.out.println(s1);
            }
        }
     }
}
