package com.myjava08;
/*
    如何调用构造方法？
    new
    格式：
        类名 对象名 = new 构造方法（）；
 */
public class StudentDemo {
    public static void main(String[] args) {
//        无参构造
        Student s = new Student();
        s.show();
//        public Student(String name)
        Student s2 = new Student("java");
        Student s3 = new Student(23);
        s2.show();
        s3.show();
//         public Student(String name, int age)
        Student s4 = new Student("java", 32);
        s4.show();

    }
}
