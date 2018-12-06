package com.myjava04;

/*
    模拟火车票，
        分析：
        A：多个窗口售票
        B：没出售一次，票数减一，总票数100
        C：少于1，停止售票
        D: while true 循环模拟售票
 */
public class TicketTest {

    public static void main(String[] args) {
//        创建售票窗口实例
        Tickets ts1 = new Tickets();

        Thread t1 = new Thread(ts1);
        Thread t2 = new Thread(ts1);
        Thread t3 = new Thread(ts1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
