package com.myjava07;
/*
    检验qq号码：
        要求：5-15位
           0不能开头
           必须是数字
    正则表达式：
        一套规则，可以匹配字符串
        boolean matches(String regex)//
 */
public class RegexDemo {
    public static void main(String[] args) {
        String qq = "1200000s03";
//        boolean b = checkQQ(qq);
//        System.out.println(b);
        boolean b = qq.matches("[1-9][0-9]{4,14}");
        System.out.println(b);
    }
    public static boolean checkQQ(String qq){
//        要求：5-15位
        int len = qq.length();
        if (len <5 || len >15){
            return false;
        }
        if (qq.startsWith("0")){
            return false;
        }
//        必须是数字
//        遍历
        for (int x=0; x<len; x++){
            char c = qq.charAt(x);
            if (c<'0' || c>'9'){
                return false;
            }
        }

        return true;
    }
}

