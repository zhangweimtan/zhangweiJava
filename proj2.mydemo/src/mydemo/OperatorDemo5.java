package mydemo;
/*
    赋值运算符：=
    扩展的赋值运算：+=
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
//        定义变量
        int a = 10;
        a += 20;
        System.out.println("a:"+a);
//        注意：扩展的赋值运算符，隐含了强制类型转换
        short s = 1;
//        s的类型转变为int，
        s += 1;
        System.out.println(s);
    }
}
