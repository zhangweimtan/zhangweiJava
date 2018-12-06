package com.myjava01;
/*
    实现多线程
    Thread
        String getName()    返回线程名称
        void setName(String name)

    CPU执行程序（线程）的随机性
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
//        创建线程实例
        MyThread mt = new MyThread();
//        修改线程名字
        mt.setName("张三");
        mt.start();
//      第二个线程
        MyThread mt2 = new MyThread();
        mt2.setName("老王");
        mt2.start();
    }
}
