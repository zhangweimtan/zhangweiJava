package com.myjava04;
/*
    执行流程：
    1，静态代码块
    2，构造代码块
    3，无参构造
    执行顺序：
    block静态代码块---Block主方法执行--coder静态代码块执行--coder构造代码块执行--coder无参空构造执行
    coder构造代码块执行--coder无参空构造执行
 */
public class BlockTest {
    static {
        System.out.println("block静态代码块");
    }
    {
        System.out.println("block构造代码块");
    }
    public BlockTest(){
        System.out.println("block无参构造执行");
    }
    public static void main(String[] args) {
        System.out.println("Block主方法执行");
        Coder c = new Coder();
        Coder c2 = new Coder();

    }
    static class Coder{
        static {
            System.out.println("coder静态代码块执行");
        }
        {
            System.out.println("coder构造代码块执行");
        }
        public Coder(){
            System.out.println("coder无参空构造执行");
        }
    }
}
