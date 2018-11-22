package com.myjava06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    把ArrayList集合中的字符串数据存储到文本文件中，
    把一个字符串元素作为文件中的一行数据

    分析：
        A：创建集合对象
        B：往集合中添加字符串元素
        C：创建输出流对象
        D：遍历，写到文本
        E：释放

 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
//        创建集合对象
        ArrayList<String> array = new ArrayList<>();
//        往集合添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("go");
//        创建输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
//        遍历集合
        for (int x=0; x<array.size(); x++){
            String s = array.get(x);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
