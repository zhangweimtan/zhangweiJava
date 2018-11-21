package com.myjava01;

import java.util.ArrayList;

/*
    为什么出现集合类：
        Java是面向对象的编程语言，面向对象编程语言对事物的描述都是通过对象来体现的；
        为了方便对多个对象进行操作，我们就必须对多个对象进行存储，而要对多个对象进行存储，
        就不能一个基本变量，而应该是一个容器变量，目前为止，我们接触的容器类数据？
        StringBuilder，数组
        StringBuilder的结果是一个字符串类型
        目前，只能选择数组，也就是前面的对象数组
        但是，数组的长度是固定的，适应不了变化的需求，如何选择？
        java提供了集合类
    集合类特定：
        长度可变
    ArrayList<E>:
        大小可变数组的实现

        <E>是一种特殊的数据类型，泛型。
        怎么用？
            在出现E的地方，我们使用引用数据类型替换即可。
            举例：ArrayList<String>:ArrayList<Student>:

    构造方法：
        ArrayList()
    添加元素：
    public boolen add(E,e):添加元素
    public void add(int index, E element)：在指定索引处，添加元素
 */
public class ArrayListDemo {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<String> array = new ArrayList<String>();
//        添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add(1,"android");


        System.out.println("array:"+array);
    }
}
