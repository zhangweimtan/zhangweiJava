package com.myjava02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    需求：
        从文件中读取数据，并显示到控制台
        读数据——输入流——FileReader

    FileReader:
        FileReader(String FileName):传递文件名

    输入流步骤：
        A：创建输入流对象
        B：调用输入流对象读数据方法
        C：释放资源
    FileNotFoundException: fr.txt (系统找不到指定的文件。)
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
//        创建输入流对象
        FileReader fr = new FileReader("fr.txt");
//        第一次读
//        int ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
////        第二次读
//        ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
////        第三次读
//        ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
////        代码重复度很高，用循环改进，但是不知道循环结束条件
//        ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
//        ch = fr.read();
//        System.out.println(ch);
        int ch;

        while ((ch=fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
