package com.myjava01;
/*
    static关键字：修饰成员变量和成员方法
        被所有对象共享
        可以用类名调用
        java-11无法成功

 */
public class StaticDemo {
    public static void main(String[] args) {
        Person.graduateFrom = "小马奔腾";
        Person p = new Person();
        p.name = "小爱";
        p.age = 18;
        p.speak();
    }
    static class Person{
        String name;
        int age;
        static String graduateFrom;
        public void speak(){
            System.out.println(name+"----"+graduateFrom);
        }
    }
}
