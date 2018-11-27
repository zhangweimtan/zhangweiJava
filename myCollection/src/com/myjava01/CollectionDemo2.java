package com.myjava01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

/*
    Collection
        boolean add();
        void clear();
        boolean contains(object o)
        boolean isEmpty()
        boolean remove()
        int size()
        Object[] toArray()
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();//多态，父类引用指向子类对象
//                boolean add();
        System.out.println(c.add("hello"));
        System.out.println(c.add("world"));
        //允许重复

//        c.clear();
        System.out.println(c);
//        boolean contains(object o)
        System.out.println(c.contains("java"));
        System.out.println(c.isEmpty());
//        boolean remove()
//        System.out.println(c.remove("hello"));
//      Object[] toArray(),任意类型的数组
        Object[] objs = c.toArray();



    }
}
