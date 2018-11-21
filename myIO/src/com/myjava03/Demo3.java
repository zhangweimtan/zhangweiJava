package com.myjava03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
    需求：把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中

    数据源：
        File...java-读数据——fileReader
    目的地：
        Copy.java-写数据—fileWriter
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
//        创建输入流
        FileReader fr = new FileReader("FileWriterDemo.java");
//        创建输出流
        FileWriter fw = new FileWriter("Copy.java");
//        定义字符数组
        char[] chs = new char[1024];
        int len;
//        len = fr.read(chs)
//        len != -1
        while ((len=fr.read(chs)) != -1){
            fw.write(chs,0,len);
            System.out.print(new String(chs,0,len));
        }
        fw.close();
        fr.close();



    }
}
