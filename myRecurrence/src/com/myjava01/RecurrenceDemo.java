package com.myjava01;
/*
    需求，求5的阶乘，5！
    5！ = 5*4*3*2*1
    5！ = 5*4！
    n! = n*(n-1)!
    递归：大问题拆成许多小问题，
    在方法本身不断调用方法自己：

     注意事项：
        递归一定要有出口
        递归次数不宜过多，内存溢出
    案例2：
        不死神兔问题，1,1,2,3,5,8
 */
public class RecurrenceDemo {
    public static void main(String[] args) {
//        第一种方式
//        int res = jC(5);
        int n = 30;
        int res = rabit(n);
        int res1 = rabit(n+1);
        float d = (float) res / (float) res1;
        System.out.println(d);

    }
    public static int jC(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n*jC(n-1);
        }
    }
    private static int rabit(int n){
        if(n == 1){
            return 1;
        }else if(n ==2){
            return 1;
        }else {
            return rabit(n-1)+rabit(n-2);
        }
    }
}
