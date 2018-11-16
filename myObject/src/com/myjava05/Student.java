package com.myjava05;

public class Student {
    String name;
    private int age;

    public void setAge(int a){
        if(a <0 || a>100){
            System.out.println("年龄有误！");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("name:"+name +", age:"+age);
    }
}
