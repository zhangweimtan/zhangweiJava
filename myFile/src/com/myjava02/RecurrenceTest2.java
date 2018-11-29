package com.myjava02;

import java.io.File;
import java.io.IOException;

/*
    需求：
        删除指定目录（包含子目录）

     注意：
        如果删除一个目录，则需要先删除这个目录下的所有子目录和子文件
 */
public class RecurrenceTest2 {
    public static void main(String[] args) throws IOException {
        new File("c\\ck\\cg").mkdirs();
        File f1 = new File("c","a.txt");
        File f2 = new File("c","b.txt");
        File f3 = new File("c","d.txt");
        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();
        File f4 = new File("c");
        method(f4);
    }
    private static void method(File f){
//        首先判断File f是目录还是文件，
        if (f.isDirectory()){
            File[] files = f.listFiles();
            for (File file: files
                 ) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                    file.delete();//文件就删除
                }
                else{
                    method(file);
                }
            }
        }
//        文件/空目录删自己
        System.out.println(f.getName());
        f.delete();
    }
}
