package com.myjava01;

import java.io.FileWriter;
import java.io.IOException;

/*
    需求：往文件中写数据
        写数据---输出流---FileWriter
    FileWriter
        FileWriter(String fileName):传递一个文件名称
    步骤：
        A：创建输出流对象
        B：调用输出流对象写数据的方法
        C：释放资源
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
//        创建对象
        FileWriter fw = new FileWriter("g:\\a.txt");
        /*
            过程：
            A：调用系统创建一个文件
            B：创建输出流对象
            C：把输出流指向文件
         */
//        写一个字符串数据
        fw.write("IO流你好");
//        数据没有直接写到文件，其实写到缓存区
        fw.flush();
//        释放资源
        fw.close();
//        通知系统，释放该文件相关的资源
    }
}
