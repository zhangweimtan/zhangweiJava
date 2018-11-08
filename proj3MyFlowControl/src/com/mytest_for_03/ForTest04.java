package com.mytest_for_03;
/*
    在控制台输出所有的水仙花数
    所谓的水仙花数：三位数，各个数字的立方和等于该数本身；
        例如：153 就是水仙花数；
        153 = 1*1*1 +5*5*5 +3*3*3
        分析：
            A：水仙花数，三位数，是一个范围，用for循环实现；
            B：获取个位，十位，百位：
                x/100,百位；x/10%10,十位；x%10,个位；
            C：

 */
public class ForTest04 {
    public static void main(String[] args) {
//
        for(int x =100; x >=100 && x < 1000; x++) {
            if(x == (x/100)*(x/100)*(x/100) + (x/10%10)*(x/10%10)*(x/10%10) + (x%10)*(x%10)*(x%10)) {
                System.out.println("水仙花数："+x);
            }
        }
    }
}
