package com.myjava03;

import java.io.*;

/*
    使用字符流复制文本文件
    数据源：图片
    目的地: c:\\ck
    二进制文件，只能使用字节流进行复制，使用windows记事本
 */
public class IODemo3 {
    public static void main(String[] args) throws IOException {
//        数据源
        String srcFile = "IODemoCopy.java";//myIO2目录——当前目录
//        目的地目录
        String dst = "c:\\ck";
        String destName = dest(srcFile, dst);
//        FileReader fr = new FileReader(srcFile);
//        FileWriter fw = new FileWriter(destName);
//        method(srcFile, destName);//字符流
//        method2(srcFile, destName);
//        method3(srcFile, destName);//图片字节流

    }

    private static String dest(String srcFile, String dst) throws IOException {
//        FileReader fr = new FileReader(srcFile);
        new File(dst).mkdir();//匿名方法
        File f = new File(dst, srcFile);
        f.createNewFile();
        String destName = f.getAbsolutePath();
//        FileWriter fw = new FileWriter(destName);
        return destName;
    }

    private static void method3(String srcFile, String destName) throws IOException {
        //        创建字节流输入对象---图片复制
        FileInputStream fis = new FileInputStream(srcFile);
//        创建字节流输出对象
        FileOutputStream fos = new FileOutputStream(destName);
//        一次读取一个字节数组
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    private static void method2(String srcFile, String destName) throws IOException {
        //        方法2，一次一个字符数组
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destName);
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);//每次写入一个len长度，保证最后一次写入正常
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    private static void method(String srcFile, String destName) throws IOException {
//        方法1，一次一个字符
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destName);
        int ch;
        while((ch= fr.read()) != -1) {
            fw.write(ch);
            fw.flush();
        }
//      释放资源
        fw.close();
        fr.close();
    }
}
