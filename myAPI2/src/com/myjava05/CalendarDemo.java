package com.myjava05;

import java.util.Calendar;

/*
    Calendar:日历，提供一些操作年月日的方法
    修改， void set(int field, int value)
          将给定的日历字段设置为给定值。
    添加
    获取 int get(int field)

 */
public class CalendarDemo {
    public static void main(String[] args) {
//        static Calendar getInstance()
        Calendar c = Calendar.getInstance();
//       int get(int field)
//        c.set(Calendar.DAY_OF_MONTH,20);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");

    }
}
