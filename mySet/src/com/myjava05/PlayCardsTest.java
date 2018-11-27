package com.myjava05;

import java.util.ArrayList;
import java.util.Collections;

/*
    模拟斗地主
 */
public class PlayCardsTest {
    public static void main(String[] args) {
//        买牌
        ArrayList<String> box = new ArrayList<>();
        String[] arr = {"黑桃","红桃","草花","方片"};
        String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        装牌
        for (String anArr : arr) {
            for (String anArr2 : arr2) {
                box.add(anArr + anArr2);
            }
        }
        box.add("大王");
        box.add("小王");
//        洗牌
        Collections.shuffle(box);
//        System.out.println(box);
//        发牌
//        创建三个玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
//        for循环，i%3==0,==1,==2
        for (int i =0; i<box.size()-3; i++){
            if (i % 3 ==0){
                player1.add(box.get(i));
            }else if (i % 3 ==1){
                player2.add(box.get(i));
            } else {
                player3.add(box.get(i));
            }
        }
        System.out.println("赌圣:"+player1);
        System.out.println("赌王:"+player2);
        System.out.println("赌神:"+player3);
        System.out.println("底牌：");
        for (int x = box.size()-3; x<box.size(); x++){
            System.out.println(box.get(x));
        }


    }
}
