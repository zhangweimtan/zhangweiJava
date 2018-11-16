package com.myjava04;
/*
    成员变量和局部变量的区别：
        A：在类中的位置不同
            成员变量：在类中，方法外
            局部变量：方法中或形参
        B：内存位置不同
            成员变量：在堆内存
            局部变量：栈内存
        C：生命周期不同
            成员变量：随着对象创建而存在，随着对象消失而消失
            局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
        D: 初始化值
            成员变量：有默认值
            局部变量：没有默认值，使用时，先定义赋值，最后使用

 */
public class Variable {
//    成员变量
    int x;
//    成员方法
    public void vary(){
//        局部变量
        int y = 0;
        System.out.println(x);
        System.out.println(y);
    }
}
