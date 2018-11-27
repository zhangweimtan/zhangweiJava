package com.myjava02;

import java.security.PrivateKey;

/*
    System:包含一些有用的类字段和方法。不能被实例化。
        static void arraycopy （Object src, int srcPos, Object dest, int destPos, int length）；复制数组，数据源src
        参数1，源数组；参数2，指定索引位置，起始位置；参数3，目标数组；参数4，目标数组起始索引位置；参数5，指定接受的元素个数；
        static long currentTimeMillis()
      返回以毫秒为单位的当前时间。毫秒时间，是相对于1970年1月1日00-00-00时间；1秒=1000毫秒
      static void exit(int status)
      终止当前正在运行的 Java 虚拟机。
      static void gc()
      运行垃圾回收器。
 */
public class SystemDemo {
    public static void main(String[] args) {
//        static long currentTimeMillis()
//        long start = System.currentTimeMillis();
//        for (int x=0; x<10000; x++){
//            System.out.println(x);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
        System.out.println(System.currentTimeMillis());
//        static void exit(int status)


    }
    private static void method(){
        int[] src = {1,2,3,4,5,6};
        int[] dest = new int[5];
        System.arraycopy(src,2,dest,0,3);
        for (int x=0; x<dest.length; x++){
            System.out.print(dest[x]);
        }
    }
}
