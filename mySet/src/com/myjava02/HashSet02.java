package com.myjava02;

import java.util.HashSet;
/*
    hashSet的add（）方法，首先进行所有元素的hash值比较
            如果hash值不一样，则添加
            如果hash值一样，equals()比较，如果一样，则不添加
            如果都不一样，则添加
 */
public class HashSet02 {
    public static void main(String[] args) {
//        创建hashSet对象
        HashSet<Student> hs = new HashSet<>();
//        创建学生对象
        Student s1 = new Student("战三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("李四", 19);
//        add
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
//        遍历增强for
        for(Student s: hs){
            System.out.println(s.name+s.age);
        }

    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        if(this.age != s.age){
            return false;
        }
        if(!this.name.equals(s.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}