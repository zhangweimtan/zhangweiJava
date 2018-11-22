package com.myjava01;
/*
    static注意事项：
            静态方法：
                可以调用静态的成员变量
                可以调用静态的成员方法
                不可以调用非静态成员变量
                静态方法只能调用静态变量
            非静态方法：
                可以调用静态的成员变量
                可以调用静态的成员方法
                可以调用非静态的成员变量，成员方法
        静态方法中是否有this这个对象？没有
        优点


 */
public class StaticDemo2 {
    public static void main(String[] args) {
        Student.graduateFrom = "小马奔腾";
        Student.study();
        Student s = new Student();
        s.name = "SS";
        s.age = 18;
        s.eat();

    }

    static class Student {
        String name;
        int age;
        static String graduateFrom;

        public static void study() {
            System.out.println(graduateFrom);
            sleep();
//            System.out.println(name);非静态无法调用
        }

        public static void sleep() {
            System.out.println("sleep");

        }
        public void eat(){
            System.out.println(graduateFrom);
            sleep();
            System.out.println(name+"---"+graduateFrom);
        }

    }
}
