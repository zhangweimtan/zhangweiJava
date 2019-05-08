package com.myweb.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MyHttpSessionListener01 implements HttpSessionActivationListener {

    @Override//钝化
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("session 钝化");
    }

    @Override//活化
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("session 活化");
    }
}
