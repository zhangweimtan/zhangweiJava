package com.myjava01;

import java.io.File;
import java.io.IOException;

/*
    File

    构造方法：
        File(File parent, String child);
        File(String pathname);
        File(File parent, String child)
    File的常用功能：
        获取
            String getName()
          返回由此抽象路径名表示的文件或目录的名称。
             String getParent()
                      返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
             File getParentFile()
                      返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
             String getPath()
                      将此抽象路径名转换为一个路径名字符串。

          修改：

 */
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
//        File(String pathname);在指定路径创建文件
//        method();
//        method2();
//        method3();
//        new File("d.txt").delete();//匿名函数
//        long length();返回文件的字节数
        System.out.println(new File("b.txt").length());
        File f2 = new File("a.txt");
        File f1 = new File("b.txt");
//        boolean renameTo(File dest);将当前啊file对象的路径，修改成目标file
        System.out.println(f1.renameTo(f2));

    }

    private static void method3() throws IOException {
        File parent = new File("c");
        parent.mkdir();
        File f = new File(parent,"d.txt");
        f.createNewFile();
//        System.out.println(f.getAbsoluteFile());//返回file对象
//        System.out.println(f.getAbsolutePath());//返回字符串
        System.out.println(f.getParent());//返回父文件夹
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
