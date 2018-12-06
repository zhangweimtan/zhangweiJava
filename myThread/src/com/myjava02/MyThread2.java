package com.myjava02;

public class MyThread2 implements Runnable {
    int num;

    public MyThread2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+i+","+num);//链式编程currentThread返回当前线程
        }
    }
}
