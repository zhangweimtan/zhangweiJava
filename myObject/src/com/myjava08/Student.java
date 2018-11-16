package com.myjava08;
/*
    构造方法：
        给对象的数据进行初始化；

    格式：
        方法名和类名相同；
        没有返回值类型，没有void
        没有具体的返回值
    构造方法的注意事项：
        A：如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法；
        B：如果我们给出了构造方法，系统将不再提供默认的无参构造方法；
            这个时候，如果我们想继续使用无参构造方法，必须自己提供；
            推荐：自己给无参构造方法
        C: 构造方法也是可以重载的
    成员变赋值：
        A：setXxx();
        B: 构造方法；
 */
public class Student {
    /* public Student(){
        System.out.println("这是构造方法");
    }
    */
    private String name;
    private int age;
    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name:"+name+", age:"+age);
    }
}
