package com.myjava;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
     这是学生管理系统的主类

        步骤如下：
        A：定义学生类
        B：学生管理系统的主界面的代码编写
        C：查看所有学生
        D：添加学生
        E：删除学生
        F：修改学生
        G：退出系统
 */
public class StudentManagementTest {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        String fileName = "students.txt";
        readData(array,fileName);
        frame(array,fileName);

    }

    //    把主界面也写成方法
    public static void frame(ArrayList<Student> array, String fileName) throws IOException{
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1,查看所有学生");
            System.out.println("2,添加学生");
            System.out.println("3,删除学生");
            System.out.println("4,修改学生");
            System.out.println("5,退出");
            System.out.println("请输入你的选择");
//        创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
//        用Switch选择
            switch (choiceString) {
                case "1":
                    //查看学生；
                    findAll(array);
                    break;
                case "2":
                    //添加学生；
                    addStudent(array,fileName);
                    break;
                case "3":
                    //删除学生；
                    delStudent(array,fileName);
                    break;
                case "4":
                    //修改学生
                    updateStudent(array,fileName);
                    break;
                case "5":
                    //退出
                    //break;
                default:
                    System.out.println("谢谢你的使用");
                    System.exit(0);//jvm退出
                    break;
            }
        }
    }
    //    查看所有学生
    public static void findAll(ArrayList<Student> array){
//        首先判断集合是否有数据，如果没有数据，给出提示，并中止
        if(array.size()==0){
            System.out.println("目前没有学生可供查询，请回去选择重新操作");
            return;
        }

        System.out.println("学号\t\t姓名\t年龄\t地址");
        for (int x=0; x<array.size(); x++){
            Student s = array.get(x);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }
    //    添加学生
    public static void addStudent(ArrayList<Student> array,String fileName)throws IOException{
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
        write2File(array,fileName);
//        提示添加成功
        System.out.println("添加学生成功");
    }
    //    删除学生
    public static void delStudent(ArrayList<Student> array, String fileName) throws IOException{
//        思路，键盘学号，到集合中寻找，看是否有，有就删除
//        创建键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号：");
        String id = sc.nextLine();
//        定义索引
        int index = -1;
//        遍历集合
        for (int x=0; x<array.size(); x++){
//            获得学生对象
            Student s = array.get(x);
            if (s.getId().equals(id)){
                index = x;//索引
                break;
            }
        }
        if (index == -1){
            System.out.println("不好意思，学号不存在，请重新输入");
        }else {
            array.remove(index);
            // 提示
            write2File(array,fileName);
            System.out.println("删除学生成功");
        }


    }
    //    修改学生
    public static void updateStudent(ArrayList<Student> array,String fileName) throws IOException{
//        思路
//        学号，到集合查找，如有，修改
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学号");
        String id = sc.nextLine();
//        定义索引
        int index = -1;
//        遍历集合
        for (int x=0; x<array.size(); x++){
//            获得学生对象
            Student s = array.get(x);
            if (s.getId().equals(id)){
                index = x;//索引
                break;
            }
        }
        if (index == -1){
            System.out.println("不好意思，学号不存在，请重新输入");
        }else {
            System.out.println("请输入学生新姓名:");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄:");
            String age = sc.nextLine();
            System.out.println("请输入学生新地址:");
            String address = sc.nextLine();
//        创建学生对象
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index,s);
            write2File(array,fileName);
            // 提示
            System.out.println("修改学生成功");
        }


    }
//    从文件读数据
    public static void readData(ArrayList<Student> array, String fileName) throws IOException {
        //        创建缓冲流
        BufferedReader br = new BufferedReader(new FileReader(fileName));

//        读取数据
        String line;
        String[] strArray;
        while ((line=br.readLine()) != null){
//            分割字符串，创建学生对象，并赋值，添加元素到集合
            strArray = line.split(",");// 返回值是字符串数组
            Student s = new Student();
            s.setId(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(strArray[2]);
            s.setAddress(strArray[3]);
            array.add(s);
        }
        br.close();

    }
//    写数据
    public static void write2File(ArrayList<Student> array, String fileName)throws IOException{
        //        创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        遍历
        for (int x=0; x<array.size(); x++){
            Student s = array.get(x);
//            line = s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress();
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}

