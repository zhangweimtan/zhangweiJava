package com.myjava05;

import java.io.*;

/*
    缓冲流的特殊功能:
    BufferedWriter
        void newLine():写一个换行符；这个换行符由系统决定，windows-\r\n.linux-\n,mac-\r
    BufferedReader
        String readLine():一次去读一行数据，但是不读取换行符
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
        for(int x=0; x<10; x++){
            bw.write("hello"+x);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
        bw.close();
//        创建输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
        String line;
//        line = br.readLine()
//        line != null
        while ((line=br.readLine()) != null){
            System.out.println(line);
        }
        br.close();


    }
}
