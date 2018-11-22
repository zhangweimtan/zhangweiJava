package com.myjava06;

import java.io.*;

/*
    复制文本文件（5中方式）
    数据源：
        FileWriterDemo.java
    目的地：
        Copy.java
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
//        方法
        String srcFile = "FileWriterDemo.java";
        String dstFile = "Copy.java";
//        method1(srcFile,dstFile);
//        method2(srcFile,dstFile);
//        method3(srcFile,dstFile);
//        method4(srcFile,dstFile);
        method5(srcFile,dstFile);
    }
//    特殊缓冲流，一次读取一行字符串,推荐
    public static void method5(String src, String dst) throws IOException {
        //        创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
        //        FileReader fr = new FileReader(src);
        //        创建输出缓冲流对象
        //        FileWriter fw = new FileWriter(dst);
        BufferedWriter bw = new BufferedWriter(new FileWriter(dst));
    //    char[] chs = new char[1024];
    //    int len;
        String line;
        while ((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();

    }

//    缓冲流，一次一个字符数组
    public static void method4(String src, String dst) throws IOException {
    //        创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
    //        FileReader fr = new FileReader(src);
        //        创建输出缓冲流对象
    //        FileWriter fw = new FileWriter(dst);
        BufferedWriter bw = new BufferedWriter(new FileWriter(dst));
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs)) != -1){
            bw.write(new String(chs,0,len));
        }
        bw.close();
        br.close();

    }

//    缓冲流，一次读写一个字符
    public static void method3(String src, String dst) throws IOException {
//        创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
//        FileReader fr = new FileReader(src);
    //        创建输出缓冲流对象
//        FileWriter fw = new FileWriter(dst);
        BufferedWriter bw = new BufferedWriter(new FileWriter(dst));

        int ch;
        while ((ch=br.read()) != -1){
            bw.write((char)ch);
        }
        bw.close();
        br.close();

    }

//    基本流，一次读一个字符数组
    public static void method2(String src, String dst) throws IOException {
    //        创建输入流对象
        FileReader fr = new FileReader(src);
    //        创建输出流对象
        FileWriter fw = new FileWriter(dst);
        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs)) != -1){
            fw.write(new String(chs,0,len));
        }
        fw.close();
        fr.close();

    }

//    基本流，一次一个字符
    public static void method1(String src, String dst) throws IOException {
//        创建输入流对象
        FileReader fr = new FileReader(src);
//        创建输出流对象
        FileWriter fw = new FileWriter(dst);
        int ch;
        while ((ch=fr.read()) != -1){
            fw.write((char)ch);
        }
        fw.close();
        fr.close();

    }

}
