package mydemo;
/*
    + 说明：
    字符参与运算，其实拿字符在计算机中存储的数据值参与运算
    ‘A’65
    ‘a’97
    ‘0’48
    字符串的计算，是字符串的拼接
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
//        定义变量
        int a = 5;
        int b = 3;
        System.out.println(a + b);
//        字符参与加法运算
        char c = 'A';
        System.out.println(a + c);
//        字符串参与运算
        System.out.println("Hello" + "\n" + "World");

    }
}
