package com.myjava01;

import java.io.File;
import java.io.IOException;
/*
    String[] list()
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
    File[] listFiles()
    static File[] listRoots()

 */

public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        File f = new File("c");
        File f2 = new File("C:\\Users\\Administrator\\IdeaProjects\\myFile");
//        method(f2);
        method2(f2); //File[] listFiles()
//        method3();


    }

    private static void method3() {
        //        static File[] listRoots():返回所有盘符
        File[] files = File.listRoots();
        for(File file:files){
            System.out.println(file);
        }
    }

    private static void method2(File f) {
        File[] files = f.listFiles();
        for (File file: files
             ) {
            if (file.isFile()){
                System.out.println(file);
            } else if(file.isDirectory()) {
                method2(file);
            }
        }
    }

    private static void method(File f2) {
        //        System.out.println(f2.getAbsolutePath());
//        String[] files = f.list()
        String[] files = f2.list();
        for (String file: files
             ) {
            System.out.println(file);
        }
    }
}
