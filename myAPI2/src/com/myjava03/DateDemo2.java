package com.myjava03;

import java.util.Date;

/*
    Date的常用方法：
        毫秒值---date
            set，返回值void，必须有参数，long
            Date(long date)
        date---毫秒
            get，返回值long，必须要参数
 */
public class DateDemo2 {
    public static void main(String[] args) {
        Date d = new Date();
//        d.setTime(1000*60*60*24);
        System.out.println(d.toLocaleString());
        System.out.println(d.getTime());
        d.setTime(1543225039090L);
        System.out.println(d.toLocaleString());


    }
}
