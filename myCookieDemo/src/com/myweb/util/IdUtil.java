package com.myweb.util;

import java.util.*;

public class IdUtil {
    public static String idCount(String ids, String id){
        String[] str = ids.split("#");
        //字符串数组转成list集合
        ArrayList<String> list = new ArrayList(Arrays.asList(str));
        //迭代器的循环
        Iterator<String> iterator = list.iterator();
        //set集合的不重合特点
        Set set = new HashSet();
        while(iterator.hasNext()){
            set.add(iterator.next());
        }
        //将set元素转成字符串
        Iterator it = set.iterator();
        StringBuffer sb = new StringBuffer();
        while(it.hasNext()){
            if(!id.equals(it.next())){
                sb.append(it.next());
            }

        }


//       str =(String[]) list.toArray();
        return sb.toString();

    }
}
