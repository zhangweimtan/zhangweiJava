package com.myjava03;

public class PhoneDemo {
    public static void main(String[] args) {
//        创建对象
        Phone p = new Phone();
        System.out.println(p.brand+"---"+p.price+"----"+p.color);
        p.brand = "锤子";
        p.price = 2999;
        p.color = "yellow";
        System.out.println(p.brand+"---"+p.price+"----"+p.color);
        p.call("haha");
        p.sendMsg();
    }
}
