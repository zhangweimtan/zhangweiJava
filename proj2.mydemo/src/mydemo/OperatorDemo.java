package mydemo;
/*
    運算符，对常量和变量进行操作的符号
    表達式：
        a, b
        a + b
    运算符分类：
        算术运算符
        赋值运算符
        关系运算符
        逻辑运算符
        三元运算符
    算术运算符：
        + - * / % ++ --
        除法/ 有时候是浮点，需要转换类型
 */
public class OperatorDemo {
    public static void main(String[] args) {
//        定义变量
        int a = 3;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
