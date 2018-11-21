package com.myjava05;

import java.io.*;

/*
    Copy File
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
//        创建输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
//        创建输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
//        特殊缓冲功能,读写数据
        String line;
//        line = br.readLine()
        while((line =br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
