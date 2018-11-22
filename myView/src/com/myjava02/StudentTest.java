package com.myjava02;

public class StudentTest {
    public static void main(String[] args) {
//        创建学生类对象
        Student s = new Student("张三",18,"男");
        s.show();
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setGender("男");
        s2.show();
        System.out.println(s.getName());
        System.out.println(s2.getName());
    }
}
