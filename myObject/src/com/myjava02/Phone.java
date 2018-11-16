package com.myjava02;
/*
    手机类：
        成员变量：品牌，价格，颜色
        成员方法：打电话，发短信
 */
public class Phone {
//    成员变量
    String brand;
    int price;
    String color;
//    成员方法
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMsg(){
        System.out.println("群发短信");
    }
}
