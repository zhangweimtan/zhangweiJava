package com.myjava03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    泛型：
 */
public class GenericDemo {
    public static void main(String[] args) {
//        创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四", 19);
//        创建集合对象
        Collection<Student> c = new ArrayList<>();
        c.add(s1);
        c.add(s2);
//        遍历
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s =  it.next();
            System.out.println(s.name+s.age);
        }


    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
