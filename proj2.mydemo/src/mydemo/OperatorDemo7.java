package mydemo;
/*
    逻辑运算符：
    逻辑与&，逻辑或|，逻辑异或^，逻辑非！；
    & :
        有false则false；全true则true；
    | ：
        有true则true；
    ^ :
        相同则true，相异则false；
    ！ ：
        ！false为true, !true为false；

    &&，||
    输出结果，布尔值
 */
public class OperatorDemo7 {
    public static void main(String[] args) {
//        定义变量
        int a = 3;
        int b = 4;
        int c = 5;
//        &
        System.out.println((a>b)&(a>c));
        System.out.println((a<b)&(a>c));
        System.out.println((a>b)&(a<c));
        System.out.println((a<b)&(a<c));
        System.out.println("-----------");
//         |
        System.out.println((a>b)|(a<c));
        System.out.println((a<b)|(a>c));
        System.out.println((a>b)|(a>c));
        System.out.println((a<b)|(a<c));
        System.out.println("-----------");
//        ^
        System.out.println((a>b)^(a<c));
        System.out.println((a<b)^(a>c));
        System.out.println((a>b)^(a>c));
        System.out.println((a<b)^(a<c));
        System.out.println("-----------");
//        !
        System.out.println(!(a>b));
        System.out.println(!(a<b));
        System.out.println(!(a>c));
        System.out.println(!(a<c));
        System.out.println("-----------");
    }
}
