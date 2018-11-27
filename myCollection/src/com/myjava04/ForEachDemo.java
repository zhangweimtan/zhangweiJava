package com.myjava04;

import java.util.ArrayList;
import java.util.Collection;

/*
    foreach:增强for循坏，一般用于遍历集合或数组
    格式：
        for(元素类型，变量：集合或者数组对象){
            直接使用变量
        }
    注意：
        在增强for循环中，不能修改集合，否则会出现并发修改异常
        底层是迭代器iterator（）
 */
public class ForEachDemo {
    public static void main(String[] args) {
//        创建集合对象
        Collection<String> c = new ArrayList();

//        添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        增强for遍历
//        for (Object obj: c) {
//            System.out.println(obj);
//        }
        for(String s: c) {
            System.out.println(s.toUpperCase());
        }

    }
}
