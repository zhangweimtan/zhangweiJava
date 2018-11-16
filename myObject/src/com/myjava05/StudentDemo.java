package com.myjava05;
/*
    Student类的测试类
    通过对象直接访问成员变量，会存在数据安全问题
    这个时候，能不能外界的对象直接访问成员变量？
    能！
    如何实现呢？
        Private关键字
   private :
        是一个修饰符；
        可以修饰成员变量，成员方法；
        被private修饰的成员，只能在本类中被访问。
    针对private修饰的成员变量，我们会相应提供getXxxx()和setXxxx()用于获取和设置成员变量，方法用public修饰
 */
public class StudentDemo {
    public static void main(String[] args) {
//        创建学生对象
        Student s = new Student();
        s.show();
        s.name = "java";
        s.setAge(32);
        s.show();
        System.out.println(s.getAge());
    }
}
