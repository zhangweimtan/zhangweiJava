package com.myjava03;

public class Student {
    private String name;
    private String age;
//    构造方法

    public Student() {
    }

    public Student(String name, String age) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
