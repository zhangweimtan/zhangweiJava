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
        获取
            String getName()
          返回由此抽象路径名表示的文件或目录的名称。
             String getParent()
                      返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
             File getParentFile()
                      返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
             String getPath()
                      将此抽象路径名转换为一个路径名字符串。
         判断：
             boolean isAbsolute()
          测试此抽象路径名是否为绝对路径名。
             boolean isDirectory()
                      测试此抽象路径名表示的文件是否是一个目录。
             boolean isFile()
                      测试此抽象路径名表示的文件是否是一个标准文件。
             boolean isHidden()
                      测试此抽象路径名指定的文件是否是一个隐藏文件。
          修改：





 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File(String pathname);在指定路径创建文件
//        File f = new File("");
        String s = "hello";
        FileWriter fw = new FileWriter("b.txt");
        fw.write(s);
        fw.close();



    }
}
