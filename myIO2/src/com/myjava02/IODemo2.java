package com.myjava02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    使用字符流复制文本文件
    数据源：IODemo.java
    目的地: g:\\IODemo.java
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
//        创建字符流对象
        String srcFile = "IODemoCopy.java";//myIO2目录——当前目录
        FileReader fr = new FileReader(srcFile);
//        创建输出流对象
        String d = "c:\\d";
        new File(d).mkdir();//匿名方法
        File f = new File(d, srcFile);
        f.createNewFile();
        String destName = f.getAbsolutePath();
        FileWriter fw = new FileWriter(destName);
//        method(fr, fw);
        method2(fr, fw);

    }

    private static void method2(FileReader fr, FileWriter fw) throws IOException {
        //        方法2，一次一个字符数组
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);//每次写入一个len长度，保证最后一次写入正常
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    private static void method(FileReader fr, FileWriter fw) throws IOException {
//        方法1，一次一个字符
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
