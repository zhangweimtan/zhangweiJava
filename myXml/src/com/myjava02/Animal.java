package com.myjava02;


public class Animal {
    private String name = "Animal";

    public Animal() {
        System.out.println("--1");
        a();
    }
    public void a(){
        System.out.println("---2");
        System.out.println(name);
    }
}
class Dog extends Animal{
    private String name = "Dog";

    public Dog(){
        System.out.println("--4");
        a();
    }

    public void a(){
        System.out.println("----3");
        System.out.println(name);
    }
}
class Test{
    public static void main(String[] args) {
        Animal animal = new Dog();
//        new Animal().a();
//        new Animal();
//        Dog dog = new Dog();
//        animal.a();
//        Animal animal2 = new Animal();
    }
}