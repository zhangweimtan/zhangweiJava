package com.myjava02;
/*
    添加功能
        public StringBuilder append(任意类型）
        添加数据，返回自身
    反转功能
        public StringBuilder reverse();
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
//        创建对象
        StringBuilder sb = new StringBuilder();
        /*
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        */
//        链式编程
        sb.append("hello").append("world").append(true).append(100);

        System.out.println("sb:"+sb);
//        reverse
        sb.reverse();
        System.out.println("sb:"+sb);

    }
}
