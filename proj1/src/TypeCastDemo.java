/*
    类型转换：
        隐式转换
        强制转换
    隐式转换：
        byte, short, char, int, long, float, double
    强制转换：
        目标类型 变量名= （目标类型）（被转换类型数据）；
        建议：数据做运算，结果应该是什么类型，就用什么类型接受，不要随意转换类型，否则精度损失。

    +：加法符合，用加法运算



 */
public class TypeCastDemo {
    public static void main(String[] args){
        //定义两个变量
        int a = 10;
        int b = 4;
        int c = a + b;
        System.out.println(c);
        //定义一个byte变量，一个int变量
        byte aa = 7;
        int bb = 10;
        System.out.println(aa + bb);
        //数据不一致，到底接受什么数据？int类型
        int cc = aa + bb;
        System.out.println(cc);

    }
}
