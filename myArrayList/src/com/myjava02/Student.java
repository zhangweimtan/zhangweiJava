package com.myjava02;

public class Student {
    private String name;
    private int age;
//    构造方法（无参，带参）

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    成员方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
