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
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
//        File(String pathname);在指定路径创建文件
//        method();
        method2();

    }

    private static void method2() throws IOException {
        File f = new File("d.txt");
        f.createNewFile();
//        System.out.println(f.createNewFile());
        System.out.println(f.isFile());
    }

    private static void method() throws IOException {
        File f = new File("c.txt");
//        System.out.println(f.createNewFile());
        System.out.println(f.exists());
    }
}
