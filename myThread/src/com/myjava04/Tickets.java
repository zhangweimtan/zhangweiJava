package com.myjava04;

/*

        同步方法：
        使用synchronized关键字修饰，一旦被一个线程访问，其他线程无法访问。
        synchronized:
        非静态，锁对象this
        可以用静态方法static修饰，锁对象class

 */
public class Tickets implements Runnable{
    static int num = 100;

    @Override
    public void run() {
//        出售火车票
        while (true){
//            method();//锁对象，this对象
            method2();//静态方法，class对象
        }

    }

    private synchronized void method() {
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
            System.exit(1);
        }
    }

    private static synchronized void method2() {
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
            System.exit(1);
        }
    }
}
