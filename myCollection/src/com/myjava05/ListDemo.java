package com.myjava05;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,"hello");
        list.add(0,"world");
        list.add(1,"java");
        System.out.println(list.get(0));
        System.out.println(list.remove(1));
        System.out.println(list.set(0,"look"));
        System.out.println(list);
    }
}
