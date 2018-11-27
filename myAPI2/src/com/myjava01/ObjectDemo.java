package com.myjava01;
/*
    object是所有类的父类
        String toString（）：返回该对象的字符串表示，@-分隔符
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            getClass():返回字节码对象
            getName():
            Integer.toHexString(hashCode()):返回指定参数的十六进制字符串形式，静态方法，用类名integer直接调用
            hashCode():返回该对象的哈希值（内存地址）
            重写toString（）方法，generator重写。在学习，测试中使用，

 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "jack";
        s.age = 18;
        System.out.println(s.toString());//com.myjava01.Student@6e8dacdf
        System.out.println(s);//说明：我们输出一个对象，默认输出这个对象的toString()方法
    }
}

class Student{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}