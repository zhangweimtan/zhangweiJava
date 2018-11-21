package com.myjava04;

import java.io.*;

/*
    COPY

 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
//        创建输入缓冲流
        BufferedReader  br = new BufferedReader(new FileReader("FileWriterDemo.java"));
//        创建输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
//        定义字符数组
        char[] chs = new char[1024];
        int len;
//        len = br.read(chs)
        while ((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }
}
