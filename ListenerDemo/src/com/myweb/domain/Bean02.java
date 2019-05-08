package com.myweb.domain;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class Bean02 implements HttpSessionActivationListener, Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override//钝化
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("session 钝化");
    }

    @Override//活化
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("session 活化");
    }
}
