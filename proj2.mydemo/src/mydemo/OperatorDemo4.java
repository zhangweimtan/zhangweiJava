package mydemo;
/*
    ++, -- 变量自增自减。变量+1 or -1
    放在变量前后，结果一样，a++ == ++a
    但是参与运算时候，
        ++在后，先算变量，然后变量再++
        ++在前，先算++，再算变量
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
//        定义变量
        int a = 10;
        System.out.println("a:" + a);
//        a ++;
//        System.out.println("a:"+a);
//        参与其他操作
//        在后
        int b = a++;
//        在前
        int c = ++a;
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}
