package com.myjava06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    从文本中读取数据到ArrayList集合中，并遍历集合
    每一行数据作为一个字符串元素

    分析：
        A：创建集合
        B：创建输入缓冲流对象
        C：读取数据，每次读取一行，把line写入array中
        D：释放资源
        E：遍历集合
 */
public class FileToArray {
    public static void main(String[] args) throws IOException {
//        创建集合
        ArrayList<String> array = new ArrayList<>();
//        创建输入缓冲数据流对象
        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
//        读取数据
        String line;
        while ((line = br.readLine()) != null){
            array.add(line);
        }
        br.close();
//        遍历集合
        for (int x =0; x<array.size(); x++){
            String s = array.get(x);
            System.out.println(s);
        }

    }
}
