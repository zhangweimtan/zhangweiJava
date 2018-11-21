package com.myjava01;

import java.io.FileWriter;
import java.io.IOException;

/*
    void Write(String Str):写字符串
    void write(string str, int index, int len)：写一个字符串中部分数据
    void write(int ch)：写一个字符数据，int类型，好处是既可以写char类型的数据，也可以写char对应的int类型值。
    void write(char[] chs)：：写一个字符数组数据
    void write（char[] chs, int index, int len)：写一个字符数组中一部分数据

 */
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
        FileWriter fw = new FileWriter("c.txt");
//        void Write(String Str)
//        fw.write("abcdef",0,5);
//        fw.write("abcdef",2,4);

//        void write(string str, int index, int len)
//        fw.write();
//        fw.write('a');
//        fw.write(97);
//        void write(char[] chs)
        char[] chs = {'a','b','d','f'};
//        fw.write(chs);
        fw.write(chs,0,2);

        fw.close();

    }
}
