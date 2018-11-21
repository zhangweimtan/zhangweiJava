package com.myjava01;

import java.io.FileWriter;
import java.io.IOException;

/*
    输出流写数据的步骤：
        A: 创建输出流对象
        B：调用写数据方法，刷新缓存
        C：释放资源
    相对路径：当前位置,推荐
    绝对路径：从盘符/root
    close,flush区别：
        flush(),刷新缓冲区，流对象可以继续使用。
        close(),先刷新缓冲区，然后通知释放资源。流对象不可使用
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");
        fw.write("hello world");
//        fw.flush();文件较少，可以不flush
        fw.close();
    }
}
