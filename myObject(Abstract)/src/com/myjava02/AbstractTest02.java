package com.myjava02;
/*
    雇员（Employee)示例
     需求：
        公司中：
            程序员（programmer)有姓名（name),工号（id),薪水（pay)，工作内容(work)
            项目经理（Manager)除了有姓名（name),工号（id),薪水（pay)，还有奖金（bonus),工作内容(work)
 */
public class AbstractTest02 {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.work();
        Manager m = new Manager();
        m.work();
    }
}

abstract class Employee{
    String name;
    String id;
    double pay;
//    工作
    public abstract void work();
}

class Manager extends Employee{
    double bonus;

    @Override
    public void work() {
        System.out.println("盯着程序员写代码");
    }
}

class Programmer extends Employee{

    @Override
    public void work() {
        System.out.println("写代码");
    }
}