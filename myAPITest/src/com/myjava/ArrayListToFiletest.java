package com.myjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    键盘录入三个学生信息（学号，姓名，年龄，居住地）存入集合。然后遍历集合，将每一个学生的信息写入文本文件（每一个学生为一行，自己定义分割标记）

    分析：
        A: 定义学生类
        B：创建集合对象
        C：写方法键盘录入，并把学生对象作为元素添加到集合
        D：创建输出缓冲流对象
        E：遍历集合，得到每一个信息，按照一定格式写入文本格式
            举例：1001，向问天，30，北京
        F：释放资源
 */
public class ArrayListToFiletest {
    public static void main(String[] args) throws IOException {
//        创建集合对象
        ArrayList<Student> array = new ArrayList<>();
//        调用方法写
        addStudent(array);
        addStudent(array);
        addStudent(array);
//        创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
//        遍历
        for (int x=0; x<array.size(); x++){
            Student s = array.get(x);
//            line = s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress();
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append("，").append(s.getName()).append("，").append(s.getAge()).append("，").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
//    键盘录入数据
    public static void addStudent(ArrayList<Student> array) {
    //        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
    //        定义id
        String id;
    //        为了返回操作，使用循环
        while (true) {
            System.out.println("请输入学生学号:");
            id = sc.nextLine();
            //判断学号是否占用
    //        添加标记
            boolean flag = false;
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                if (s.getId().equals(id)) {
                    flag = true;//说明被占用了
                    break;
                }
            }
            if (flag) {
                System.out.println("你输入的学好已经被占用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生地址:");
        String address = sc.nextLine();
    //        创建学生对象
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
    //        添加到集合
        array.add(s);
    //        提示添加成功
        System.out.println("添加学生成功");
    }

}
