package com.myjava01;
/*
    自动生成构造方法；
    右键-generate-constructor，None是无参，shift选择参数
    自动生成成员方法，getXxx() setXxx();
 */
public class Student {
    private String name;
    private int age;

//    无参构造
    public Student() {
    }
//    带参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    成员方法getter,setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
