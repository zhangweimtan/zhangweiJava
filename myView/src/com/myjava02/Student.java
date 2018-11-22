package com.myjava02;
/*
    定义一个标准学生类，在主方法中创建对象并调用
        姓名，年龄，性别3个成员变量
        无参，带参两个构造方法
        为每个成员变量定义getter/setter方法
        定义一个show方法，输出成员变量

 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show(){
        System.out.println(name+","+age+","+gender);
    }
}
