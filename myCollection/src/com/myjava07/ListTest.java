package com.myjava07;

import java.util.ArrayList;
import java.util.List;

/*
    定义一个方法，返回指定列表中指定元素的索引位置
    判断某元素是否存在
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

//        int index = index(list, "php");
//        System.out.println(index);
        int index = list.indexOf("php");

        boolean b = contains(list,"php");
        System.out.println(b);
        boolean b1 = list.contains("java");


    }
    public static int index(List list, Object other){
        for (int x=0; x< list.size(); x++) {
            Object obj = list.get(x);
            if(obj.equals(other)){
                return x;
            }
        }
        return -1;
    }
    public static boolean contains(List list, Object other) {
        int index = index( list, other);
        if (index >=0){
            return true;
        }
        return false;
    }
}
