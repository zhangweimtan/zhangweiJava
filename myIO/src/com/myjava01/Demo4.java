package com.myjava01;

import java.io.FileWriter;
import java.io.IOException;

/*
    如何数据换行？
    \n可以实现换行，但是windows识别换行不是\n, 而是\r\n
    windows:\r\n
    linux：\n
    mac:\r
    如何实现数据的追加写入？

 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
        FileWriter fw = new FileWriter("a.txt",true);//true追加数据
        for (int x=0; x<10; x++){
            fw.write("hello"+x);
            fw.write("\r\n");
        }
        fw.close();
    }
}
