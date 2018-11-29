package com.myjava01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    File

    构造方法：
        File(File parent, String child);
        File(String pathname);
        File(File parent, String child)
    File的常用功能：
        创建
             boolean createNewFile()
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
           boolean mkdir()
          创建此抽象路径名指定的目录。 
             boolean mkdirs()
                      创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
        删除
            boolean delete()
          删除此抽象路径名表示的文件或目录。
    绝对路径：固定路径
    相对路径：
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
//        File(String pathname);在指定路径创建文件
        File f = new File("g:\\a\\a.txt");//绝对
        File f2 = new File("a.txt");//相对
        File f3 = new File("e");//相对
        File f4 = new File("c\\b\\d");
//        String s = "hello";
//        System.out.println(f2.createNewFile());//创建文件

//        System.out.println(f4.mkdirs());//mkdir,mkdirs;创建文件夹
//        System.out.println(f3.mkdir());//mkdir,mkdirs;创建文件夹
//        System.out.println(f2.delete());//删除文件或者文件夹,注意，文件夹下不能有文件或文件夹，不走回收站
        System.out.println(f3.delete());






    }
}
