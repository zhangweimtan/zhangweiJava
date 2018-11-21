package com.myjava03;

import java.util.ArrayList;
import java.util.Scanner;

/*
    创建一个集合对象，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合；
    注意：
        为了方便使用，我把学生类所有成员定义为String类型

    分析：
        A：定义学生类
        B：创建集合对象
        C：键盘录入数据
        D：创建学生对象，把键盘录入的数据赋值给学生成员变量
        E：把学生对象作为元素存储到集合中
        F：遍历
 */
public class StudentDemo {
    public static void main(String[] args) {
//        创建集合
        ArrayList<Student> array = new ArrayList<>();
////        键盘录入
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄：");
//        String age = sc.nextLine();
////        创建学生对象
//        Student s = new Student();
//        s.setName(name);
//        s.setAge(age);
////        存储到集合
//        array.add(s);

//        为了提高代码的复用性，把录入学生对象，存储集合，用方法封装
//        调用方法
        addStudent(array);
        addStudent(array);
        addStudent(array);
//        遍历
        for (int x=0; x<array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getName()+"--"+s.getAge());
        }

    }
//    明确：
//    返回值类型：void;参数类型：ArrayList<Student> array
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
//        创建学生对象
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
//        存储到集合
        array.add(s);
    }
}
