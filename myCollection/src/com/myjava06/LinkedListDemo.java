package com.myjava06;

import java.util.LinkedList;

/*
    List:
        ArrayList:
            底层是数组结构，查询库，增删慢
        LinkedList：
            底层是链表，查询慢，增删块

    如何选择？
        查询多，增删少，使用ArrayList
        查询少，增删多，使用LinkedList
        如果不知道使用什么，使用ArrayList
    LinkedList特有的功能：
        void addFirst()
        void addLast()
        E  getFirst()
        E getLast()
        E removeFirst()
        E removeLast()

 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.addFirst("android");
        list.addFirst("app");
        list.addLast("ios");

        System.out.println(list);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);




    }
}
