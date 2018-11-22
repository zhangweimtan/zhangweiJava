package com.myjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    把文本中数据提取出来，存储到集合中，然后遍历集合，输出在控制台

    分析：
        A：定义学生类
        B：创建输入缓冲流对象
        C：创建集合对象
        D：读取文件，把数据按照一定格式，进行分割，赋值给学生对象，把学生元素存储到集合
            1001，向问天，30，北京
        E：释放资源
        F：遍历集合
 */
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
//        创建缓冲流
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
//        创建集合
        ArrayList<Student> array = new ArrayList<>();
//        读取数据
        String line;
//        char[] chs = new char[];
        String[] strArray;
        while ((line=br.readLine()) != null){
//            分割字符串，创建学生对象，并赋值，添加元素到集合
            strArray = line.split("，");// 返回值是字符串数组
            Student s = new Student();
            s.setId(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(strArray[2]);
            s.setAddress(strArray[3]);
            array.add(s);
        }
        br.close();
//        遍历集合
        System.out.println("学号"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"地址");
        for(int x=0;x<array.size(); x++){
            Student s = array.get(x);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }
}
