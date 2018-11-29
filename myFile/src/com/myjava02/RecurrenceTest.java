package com.myjava02;

import java.io.File;

/*
    需求：输出指定目录下的所有Java文件（包含子目录）
    写方法 void
        参数，File file
        方法，File[] = fileList(),返回文件及子目录
        判断 isFile()——否，递归
        String-file.getAbsolutePath().endWith("java")
        正则—？


 */
public class RecurrenceTest {
    public static void main(String[] args) {
//        创建file对象，
        File f = new File("C:\\Users\\Administrator\\IdeaProjects\\myFile");
        method(f);
    }
    private static void method(File f){
//        首先要判断是文件还是目录，目录就分解子目录及目录下文件
        if(f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files
            ) {
                if (file.isFile()) {//目录下的文件
                    if(file.getName().endsWith(".java")) {
                        System.out.println(file);
                    }
                } else {//子目录else if (file.isDirectory())
                    method(file);
                }
            }
        }
        else {// 如果不是目录，对文件的判断
            if (f.getName().endsWith(".java")){
                System.out.println(f);
            }
        }
    }
}
