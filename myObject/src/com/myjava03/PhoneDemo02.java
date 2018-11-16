package com.myjava03;

public class PhoneDemo02 {
    public static void main(String[] args) {
//        创建类对象Phone
        Phone p = new Phone();
        p.brand = "OPPO";
        p.price = 2999;
        p.color = "白色";
        System.out.println(p.brand+"---"+p.price+"---"+p.color);

        Phone p2 = p;
        p2.brand = "小米";
        p2.price = 1999;
        p2.color = "红色";
        System.out.println(p.brand+"---"+p.price+"---"+p.color);
        System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);

    }
}
