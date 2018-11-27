package com.myjava01;

import java.util.Objects;

/*
    boolean equals(Object obj)
        ==来比较两个对象是否相等，引用对象比较地址值

 */
public class ObjectDemo2 {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        Person p2 = new Person("张三", 18);

        boolean flag = p.equals(p2);
        System.out.println(flag);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
//        比较地址，提高效率
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }


}
