package com.myjava03;

import java.util.HashSet;

public class HashCodeDemo03 {
    public static void main(String[] args) {
//        创建集合对象
        HashSet<Person> hs = new HashSet<>();
//        创建person对象
        Person p1 = new Person("zs",18);
        Person p2 = new Person("ls",20);
        Person p3 = new Person("ls",20);
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
//        遍历
        for (Person p: hs){
            System.out.println(p);
        }

    }
}