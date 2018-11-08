package com.mytest_01;
/*
    if -else if -else 表达式：
    if(关系表达式1)｛
    语句体1｝else if(关系表达式2）｛
    语句体2｝else if(关系表达式..
    ...
    else(
    语句体n+1
    ｝
    执行流程：
        A：计算关系表达式1，true or false
        B： true进入语句体1，false进入else if，计算关系表达式2

 */
public class IfTest03 {
    public static void main(String[] args) {
        System.out.println("start");
//        define varies
//        x , y的关系满足如下：
//        x >=3, y = 2x +1;
//        -1<=x<3, y = 2x;
//        x<-1, y = 2x -1;
        int a = 10;
        if(a >= 3) {
            int b = a*2 +1;
            System.out.println(b);
        }else if(a < 3 & a >=-1){
            int b = a*2;
            System.out.println(b);
        }else{
            int b = a*2 -1;
            System.out.println(b);
        }
        System.out.println("end");
    }
}
