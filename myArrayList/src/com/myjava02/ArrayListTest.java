package com.myjava02;

import java.util.ArrayList;

/*
    存储字符串并遍历

    分析：
        A：创建集合对象
        B：添加字符串元素
        C：遍历集合
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<String> array = new ArrayList<String>();
//        添加元素
        array.add("令狐冲");
        array.add("曲阳");
        array.add("左冷禅");
        array.add("向问天");
//        遍历
        for(int x =0; x<array.size(); x++){
            String s = array.get(x);
            System.out.println(s);
        }
    }
}
