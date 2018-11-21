package com.myjava01;

import java.util.ArrayList;

/*
    ArrayListj集合遍历
 */
public class Demo03 {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<String> array = new ArrayList<String>();
//        添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
//        遍历，get
        for(int x=0; x<array.size(); x++){
            System.out.println("get:"+ array.get(x));
        }
        System.out.println("-------------");
//        最标准的用法
        for (int x=0; x<array.size(); x++){
            String s = array.get(x);
            System.out.println(s);
        }

    }
}
