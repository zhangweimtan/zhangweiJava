package com.myjava04;

import java.util.*;

/*
    Collection是顶层集合，
    Collections的工具类，方法都是用于操作collection，

    static <T> int
    binarySearch(List<? extends Comparable<? super T>> list, T key)
          使用二分搜索法搜索指定列表，以获得指定对象。
 */
public class CollectionsDemo {
    public static void main(String[] args) {
//        method();
//        method02();
//        method03();
//        method04();
//        method05();
    }

    private static void method05() {
//        排序
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void method04() {
//        随机置换
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.shuffle(list);
        System.out.println(list);
    }

    private static void method03() {
//        反转
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void method02() {
        //        copy,注意，目标列表长度大于等于源列表
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("word");
        List<String> src = new ArrayList<>();
        src.add("");
        src.add("");
        src.add("");
        src.add("java");
        Collections.copy(src,list);
        System.out.println(src);
    }

    private static void method() {
        //        static int  binarySearch(List list, Object key) 二分查找
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int index = Collections.binarySearch(list,4);
        System.out.println(index);
    }
}
