package com.myjava01;

import java.util.ArrayList;

/*
    获取元素
        get(int index):返回指定索引元素
    集合长度
        size():返回集合中元素个数
    删除元素
        remove(Obj);删除指定的元素，返回boolean，
        remove(int index):返回被删除元素
    修改元素
        set(int index, E element);修改指定索引处的元素，返回被修改的元素
 */
public class Dem02 {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<String> array = new ArrayList<String>();

//        添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
//        输出
        System.out.println("array:"+array);
//        获取元素get
//        System.out.println("get:"+array.get(0));
//        System.out.println("get:"+array.get(1));
//        System.out.println("get:"+array.get(2));
//        集合长度size
//        System.out.println("size:"+array.size());
//          删除元素
//        System.out.println("remove:"+array.remove("world"));
//        System.out.println("remove:"+array.remove("world"));

//        指定删除
//        System.out.println("remove:"+array.remove(0));
//        System.out.println("array:"+array);
//        修改元素
        System.out.println("set:"+array.set(1,"android"));
        System.out.println("array:"+array);

    }
}
