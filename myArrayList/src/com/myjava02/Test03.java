package com.myjava02;

import java.util.ArrayList;

/*
    存储自定义对象并遍历
    分析：
        A：定义学生类
        B：创建集合对象
        C：创建学生对象
        D：把学生对象添加到集合
        E：遍历

 */
public class Test03 {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<Student> array = new ArrayList<>();
//        创建学生对象
        Student s1 = new Student("张三",28);
        Student s2 = new Student("李四",27);
        Student s3 = new Student("王五",30);
        Student s4 = new Student("老七",32);
//        添加
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
//        遍历
        for(int x=0; x<array.size(); x++){
            Student s = array.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }


    }
}
