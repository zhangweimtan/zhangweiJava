package com.myjava03;
/*
    出现安全问题的原因：
        多线程
        要有多个线程共享的数据
        多个线程并发的访问共享数据

    无法共享的例子：
        厕所
        锁上，打开

    synchronized:同步，修饰代码块和方法
    同步：安全性高，效率低
    非同步：安全性低，效率高
 */
public class Tickets implements Runnable{
    int num = 100;
    Object obj = new Object();

    @Override
    public void run() {
//        出售火车票
        while (true){
            synchronized (obj) {
                if (num > 0) {
                    //sleep静态方法
                /*
                    两个窗口
                    假设还剩最后一张，
                    t1，>0, 进来，休眠，
                    t2, >0, 进来，休眠
                    t1,进入输出语句
                    t2,进入输出语句，tickets = 0

                 */
                    try {
                        Thread.sleep(100);
                        System.out.println("售票间歇时间");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口出售第" + num-- + "张票");
                } else {
                    break;
                }
            }
        }

    }
}
