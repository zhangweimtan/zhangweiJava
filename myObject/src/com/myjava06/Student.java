package com.myjava06;
/*
    学生类
 */
public class Student {
//    私有
    private String name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a) {
        if (a<0 || a >100){
            System.out.println("年龄有误！");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }

}
