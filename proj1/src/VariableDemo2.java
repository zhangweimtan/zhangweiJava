/*
    变量定义的注意事项：
    A：变量未赋值，不能直接使用
    B：
 */
public class VariableDemo2 {
    public static void main(String[] args){
        //定义一个变量
        int a = 10;
        System.out.println(a);
        int b;
        b = 20;
        System.out.println(b);
        {
            //代码块
            int c = 30;
            System.out.println(c);
        }
        int c , d;
        c = 10;
        d = 21;
        System.out.println(c+d);
        {
            int aa, bb;
            aa = 11;
            bb = 21;
            System.out.println(aa+bb);
        }
    }
}
