package com.myjava02;

/*
    多线程实现方式2：创建线程的另一种声明实现Runnable接口类。该类然后实现run方法，可以分配该类的实例，在创建Thread时作为一个参数传递

    Thread(Runnable target)
    static Thread currentThread():静态方法，返回当前线程对象
    既然有了继承Thread，为何还要Runnable接口？
    java单一继承
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        method();
//        method2();

    }

    private static void method2() {
        //        创建线程实例
//        共享了Thread参数
        MyThread2 mt = new MyThread2(100);
        Thread t = new Thread(mt);
        t.setName("李四");
        t.start();
//        创建线程实例
        Thread t2 = new Thread(mt);
        t2.setName("老王");
        t2.start();
    }

    private static void method() {
        //        创建线程实例
        MyThread2 mt = new MyThread2(100);
        Thread t = new Thread(mt);
        t.setName("李四");
        t.start();
//        创建线程实例
        MyThread2 mt2 = new MyThread2(200);
        Thread t2 = new Thread(mt2);
        t2.setName("老王");
        t2.start();
    }
}
