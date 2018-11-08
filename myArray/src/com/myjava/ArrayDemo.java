package com.myjava;
/*
    array：
    存储同一种数据类型的多个元素的容器；
    定义数组：
        A：数据类型[] 数组名；
        B：数据类型数组名[];

        举例：
            int[] arr;定义了一个int类型的数组，数组名是arr；推荐的
            int arr[];定义了一个int类型的变量，变量名是arr数组；
       数组初始化：
            A：所谓的初始化，就是为数组开辟内存空间，并为数组中的每个元素赋予初始值；
            B：有两种方式，可是实现数组的初始化，
                a: 动态初始化；只给出长度，由系统给出初始化值；
                b: 静态初始化；给出初始化值，有系统决定长度
      动态初始化：
            数据类型[] 数组名= new 数据类型[数组长度]；
       静态初始化：
            数据类型[] 数组名= new shu
 */
public class ArrayDemo {
    public static void main(String[] args) {
//        动态初始化数组
        int[] arr = new int[3];
//        左边：
//        int 数组元素是int类型
//        []: 说明是一个数组
//        arr：这是数组名称
//        右边：
//        new: 为数组申请内存分配，开辟空间
//        int：数组元素是int类型
//        []:
//        3: 数组长度，元素个数

//        输出数组名称：
        System.out.println("arr:"+arr);
//        获取数组的地址值是无意义的，需要数组中的元素值
//        数组中每个元素都是有编号的，编号从0开始，最大编号是长度-1；
//        编号的专业叫法：索引
//        访问格式:数组名[索引]
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
