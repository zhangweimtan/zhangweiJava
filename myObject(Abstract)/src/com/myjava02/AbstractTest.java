package com.myjava02;
/*
    基本班老湿，就业班老湿
    共性：
        属性 姓名，年龄，性别
        行为 讲课，唱歌
 */
public class AbstractTest {
    public static void main(String[] args) {
        BasicTeacher bt = new BasicTeacher();
        bt.name = "风清扬";
        bt.teach();

        JobTeacher jt = new JobTeacher();
        jt.name = "苍老师";
        jt.teach();
    }
}

abstract class Teacher{
    String name;
    int age;
    String gender;
//    抽象方法
    public abstract void teach();

}
class BasicTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+"讲基础班课程");
    }
}

class JobTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+"讲就业班课程");
    }
}