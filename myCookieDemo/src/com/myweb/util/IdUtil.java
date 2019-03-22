package com.myweb.util;


public class IdUtil {
    public static String idCount(String ids, String id) {
        //创建sb,对ids进行排序，去重，首位添加
        StringBuilder sb = new StringBuilder(ids);
        int i = sb.indexOf(id);
        if (i != -1) {
            sb.deleteCharAt(i).insert(0, id);
        } else {
            sb.insert(0, id);
        }
        return sb.toString();

    }
}
