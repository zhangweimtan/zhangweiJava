package com.myjava04;

public class BlockDemo {
    public static void main(String[] args) {
        {
            /*
                局部代码块：存在于方法中，控制变量，控制变量生命周期（作用域）
             */
        }
        Teacher t = new Teacher();
    }
    static class Teacher{
        String name;
        int age;
        public Teacher(){
        }
        public Teacher(String name, int age){
            this.name = name;
            this.age = age;
        }
//        构造代码块：提取构造方法中的共性，每次创建对象都会执行，并且在构造方法执行之前执行；
        {
            for(int x=0; x<10; x++){
                System.out.println("i o java");
            }
        }
//        静态代码块,随着类的加载而加载，只加载一次，加载类时需要做的一些初始化，比如，加载驱动
        static {
            System.out.println("i o java");
        }
    }
}
