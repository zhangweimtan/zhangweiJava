package com.myjava03;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    需求：
        把项目路径下的FileWriteDemo.java的内容复制到copy.java中

    文件复制有规律可循
    套路：
        数据源：读数据—fileReader
        目的地：写数据—fileWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //    创建输入流对象
        FileReader fr = new FileReader("FileWriterDemo.java");
//        创建输出流对象
        FileWriter fw = new FileWriter("Copy.java");
        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
