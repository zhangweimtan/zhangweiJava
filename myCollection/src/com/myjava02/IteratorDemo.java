package com.myjava02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    集合的遍历：
        1，toArray(),可以把集合转换成数组，然后遍历数组即可；
        2，iterator(),
    Iterator:可以遍历集合
        next()
       注意：使用next()获取下一个元素，如果没有元素，返回异常
 */
public class IteratorDemo {
    public static void main(String[] args) {
//        method();
        //        创建集合对象
        Collection c = new ArrayList();
//        add
        c.add("hello");
        c.add("world");
        c.add("java");
//        获取迭代器对象,hasNext(),返回boolean
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println(it.hasNext());
//        System.out.println(it.hasNext());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
    }

    private static void method() {
        //        创建集合对象
        Collection c = new ArrayList();
//        add
        c.add("hello");
        c.add("world");
        c.add("java");
//        转换数组
        Object[] objs = c.toArray();
//        遍历
        for (int x=0; x<objs.length; x++){
            System.out.println(objs[x]);
        }
    }
}
