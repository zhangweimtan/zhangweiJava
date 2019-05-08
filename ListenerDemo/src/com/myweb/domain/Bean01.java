package com.myweb.domain;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Bean01 implements HttpSessionBindingListener {
    private String name;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("绑定。。。");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("解除绑定。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
