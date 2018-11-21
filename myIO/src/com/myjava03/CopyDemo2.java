package com.myjava03;

import java.io.FileReader;
import java.io.IOException;

/*
    输入流读取数据步骤：
        A：创建输入流对象
        B：调用输入流对象的读数据方法
        C：释放资源

 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
//        创建输入流对象
        FileReader fr = new FileReader("fr2.txt");
//        一次读取一个字符数组的数据
//        int read(char[] cuf);
//        char[] chs = new char[5];
//        第一次读
//        int len = fr.read(chs);
////        System.out.println("len:"+len);
//        System.out.println(new String(chs,0,len));
////        第二次
//        len = fr.read(chs);
////        System.out.println("len:"+len);
//        System.out.println(new String(chs,0,len));
////        第三次
//        len = fr.read(chs);
////        System.out.println("len:"+len);
//        System.out.println(new String(chs,0,len));
//
//        len = fr.read(chs);
//        System.out.println("len:"+len);
//        len = fr.read(chs);
//        System.out.println("len:"+len);
//        char[] chs = new char[5];
        char[] chs = new char[1024];//1024的整数倍
        int len;
//        len = fr.read(chs)
//        len != -1
        while ((len=fr.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }
        fr.close();
    }
}
