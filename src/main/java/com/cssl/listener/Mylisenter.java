package com.cssl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Mylisenter implements ServletContextListener, HttpSessionListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("application创建...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("application销毁...");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session创建...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session销毁...");
    }
}
