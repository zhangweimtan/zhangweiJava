package mydemo;
/*
    三元运算符：
        关系表达式？表达式1：表达式2
    执行流程：
        第一步，计算表达式的值，true / false
        第二步，true,表达式1就是结果
            false,表达式2就是结果
 */
public class OperatorDemo8 {
    public static void main(String[] args) {
//        定义变量
        int a = 10;
        int b = 20;
        int c = (a > b)?a:b;
        System.out.println("c:"+c);
//        布尔类型
        boolean d = (a == b)?true:false;
        boolean flag = (a == b);
        System.out.println("d:"+d);
        System.out.println("flag:" +flag);
    }
}
