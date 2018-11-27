package com.myjava04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat:
        格式化：
        Date---String
        String format(Date date)
        解析：
        String --- Date
        Date parse(String s)

    构造方法：
        SimpleDateFormat()
          用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
      SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。

      注意：
      解析的字符串，模式必须与创建的模式一样，
      否则，需要给定模式，有参构造

      规律：四个小姨，两个大美眉两个小弟弟
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
//        默认模式创建
//        method1();
        //        使用指定的模式进行对象的创建
//        method2();
//        1999年9月1日 10:10:10模式创建
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
//        格式化
        String s = sdf.format(date);
        System.out.println(s);
//        parse
        Date d = sdf.parse("2018年11月26日 18:20:13");
        System.out.println(d.toLocaleString());

    }

    private static void method2() throws ParseException {
        //        使用指定的模式进行对象的创建
//        1999年9月1日；yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
//        parse
        Date d = sdf.parse("2018年11月26日");
        System.out.println(d.toLocaleString());
    }

    private static void method1() throws ParseException {
        //        使用默认格式：
        SimpleDateFormat sdf = new SimpleDateFormat();
//        格式化
//        创建日期对象
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
//        解析
        Date d = sdf.parse("2018/11/26 下午5:54");
        System.out.println(d.toString());
    }
}
