package com.myjava04;

import java.io.*;

/*
    BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符/数组、字符串的高校写入

 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建输出缓冲流对象
        /*
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
        bw.write("hello");
//        bw.flush();
        bw.close();
        */
//        创建输入流缓冲对象
        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
//        一次一个字符
      /*
        int ch;
//        ch = br.read();
        while((ch=br.read()) != -1){
            System.out.print((char)ch);
        }
        */

//        一次一个字符数组
        char[] chs = new char[1024];
        int len;
//        len = br.read(chs);
        while ((len=br.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }

        br.close();

    }
}
