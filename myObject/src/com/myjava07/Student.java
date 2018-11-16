package com.myjava07;
/*
    学生类
    n 与a，参数没有见名知意，需要改进
    如果局部变量和成员变量名相同，在局部使用时候，采用就近原则
    有没有办法，把局部变量的name赋值给成员变量的name呢？
    什么办法？
    用 this 关键字
    代表所在类的对象引用，
    使用场景：
        局部变量隐藏成员变量
 */
public class Student {
//    私有
    private String name;
    private int age;
    public void setName(String name){
//        name = name;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        if (age<0 || age >100){
            System.out.println("年龄有误！");
        }else {
//            age = age;
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

}
