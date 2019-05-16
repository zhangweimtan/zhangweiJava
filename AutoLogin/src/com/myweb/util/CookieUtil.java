package com.myweb.util;

import javax.servlet.http.Cookie;

public class CookieUtil {
    public static Cookie findCookie(Cookie[] cookies, String name){
        if(cookies != null){
            for (Cookie cookie:cookies) {
                //遍历cookie，找到cookie中key-name == name，返回cookie
                if(name.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }
}
