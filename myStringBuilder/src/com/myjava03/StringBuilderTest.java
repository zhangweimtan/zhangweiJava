package com.myjava03;
/*
    StringBuilder和String的相互转换
    StringBuilder---String
    String----StringBuilder
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("world");

//        StringBuilder---String;
        String s = sb.toString();
        System.out.println(s);
//        String----StringBuilder
        String ss = "helloworld";
        StringBuilder sbb = new StringBuilder(ss);
        System.out.println(sbb);

    }
}
