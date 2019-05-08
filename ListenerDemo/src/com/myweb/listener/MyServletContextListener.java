package com.myweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 实现接口ServletContextListener
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("启动。。。");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("终止。。。");
    }
}
