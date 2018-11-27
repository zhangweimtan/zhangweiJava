package com.myjava01;

import java.util.ArrayList;

/*
    ArrayList
    集合的体系结构：
        由于不同的数据结构，（数据的组织，存储方式），Java提供了不同的集合；
        由于不同的集合他们的功能相思，不断向上提取，将共性抽取出来，这就是集合体系结构形成的原因

    体系结构：
        怎么学习？最顶层，包含了所有的共性；
        怎么使用？最底层，具体的实现

    Collection
    List
    ArrayList

 */
public class CollectionDemo {
    public static void main(String[] args) {
//        method();


    }

    private static void method() {
        //        创建集合对象
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
//        遍历集合
        for (int x=0; x<list.size(); x++){
            System.out.println(list.get(x));
        }
    }
}
