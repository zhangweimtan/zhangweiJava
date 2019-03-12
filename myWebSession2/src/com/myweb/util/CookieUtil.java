package com.myweb.util;

import javax.servlet.http.Cookie;

public class CookieUtil {
    public static Cookie findCookie(Cookie[] cookies, String name){
        if(cookies != null){
            for (Cookie cookie:cookies){
                //找到对应cookie.getName
                if(name.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }
}
