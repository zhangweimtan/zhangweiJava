package com.myjava03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用字节流复制文本文件
    数据源：
    目的地
 */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
//        数据源
        String srcFile = "IODemoCopy.java";//myIO2目录——当前目录
//        目的地目录
        String dst = "c:\\cg";
        String destName = dest(srcFile, dst);
        method(srcFile, destName);
        return;
    }

    private static void method(String srcFile, String destName) throws IOException {
        //        创建字节流输入对象
        FileInputStream fis = new FileInputStream(srcFile);
//        创建字节流输出对象
        FileOutputStream fos = new FileOutputStream(destName);
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    private static String dest(String srcFile, String dst) throws IOException {
        new File(dst).mkdir();//匿名方法，创建目录
        File f = new File(dst, srcFile);//拼接绝对路径
        f.createNewFile();//创建目的地文件
        return f.getAbsolutePath();//返回目的文件路径字符串
    }
}
