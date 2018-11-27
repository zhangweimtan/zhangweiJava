package com.myjava01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    使用HashSet存储字符串并遍历
    set 集合的特点：
        无序，（存储和读取的顺序有可能不一样）
        不允许重复，唯一；
        没有索引
 */
public class HashSetDemo {
    public static void main(String[] args) {
//        创建集合对象
//        HashSet<String> hs = new HashSet<>();
        Set<String> set = new HashSet<>();
//        add
        set.add("hello");
        set.add("world");
        set.add("java");
//        遍历
//        三种，转数组，迭代器，增强for

//        method(set);
//        method01(set);
        for(String s: set){
            System.out.println(s);
        }

    }

    private static void method01(Set<String> set) {
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

    private static void method(Set<String> set) {
        Object[] objs = set.toArray();
        for (int x=0; x<objs.length; x++){
            System.out.println(objs[x]);
        }
    }
}
