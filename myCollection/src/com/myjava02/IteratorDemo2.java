package com.myjava02;

import java.util.*;

/*
    需求：判断集合是否保函Java，如有添加android
    Exception in thread "main" java.util.ConcurrentModificationException：并发修改异常
    迭代器是依赖于集合的，相当于集合的一个副本，当迭代器在操作时候，如果出现和集合不一样，则抛出异常；
    解决方法：
        A：别使用迭代器
        B：在使用迭代器遍历，使用迭代器来修改


 */
public class IteratorDemo2 {
    public static void main(String[] args) {
//        method();
        //        创建集合对象
//        Collection c = new ArrayList();
        List c = new ArrayList();
//        add
        c.add("hello");
        c.add("world");
        c.add("java");
//        Iterator it = c.iterator();
//        while(it.hasNext()){
//            String s = (String) it.next();
//            if(s.equals("java")){
//                c.add("android");
//            }
//        }
//        在使用迭代器遍历，使用迭代器来修改
        ListIterator lit = c.listIterator();
        while (lit.hasNext()){
            String s = (String) lit.next();
            if(s.equals("java")){
                lit.add("android");
            }
        }
        System.out.println(c);
    }

    private static void method() {
        //        创建集合对象
        Collection c = new ArrayList();
//        add
        c.add("hello");
        c.add("world");
        c.add("java");
//        判断集合中是否有Java，
        if(c.contains("java")){
            c.add("android");
        }
        System.out.println(c);
    }
}
