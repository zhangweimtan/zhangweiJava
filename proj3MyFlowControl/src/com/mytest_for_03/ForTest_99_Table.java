package com.mytest_for_03;
/*
    九九乘法口诀
 */
public class ForTest_99_Table {
    public static void main(String[] args) {
//       定义变量
        for(int i=1; i<10; i++ ) {
            for(int j =1; j<=i; j++) {
                System.out.printf("%d*%d=%2d%s",i, j, i*j,"\t");
            }
            System.out.println();
        }
    }
}
