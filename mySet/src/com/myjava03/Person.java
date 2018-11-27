package com.myjava03;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person"+"["+name+","+age+"]";
    }

    @Override
    public int hashCode() {
//        比较成员变量值，基本数据+引用数据的hashCode返回值
        return age + name.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("-------");
////        提高效率
//        if (this == obj){
//            return true;
//        }
////        提高安全性，判断是否需要转型
//        if (this.getClass()!=obj.getClass()){
//            return false;
//        }
//
//        Person p = (Person)obj;
//        if(this.age != p.age){
//            return false;
//        }
//        if (!this.name.equals(p.name)){
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }
}

