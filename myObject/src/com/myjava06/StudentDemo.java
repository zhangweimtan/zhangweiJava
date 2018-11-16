package com.myjava06;
/*
    测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
//        创建对象
        Student s = new Student();
        System.out.println("name:"+s.getName()+", age:"+s.getAge());
        s.setAge(32);
        s.setName("java");
        System.out.println("name:"+s.getName()+", age:"+s.getAge());
        s.setAge(30);
        s.setName("haha");
        System.out.println("name:"+s.getName()+", age:"+s.getAge());
    }
}
