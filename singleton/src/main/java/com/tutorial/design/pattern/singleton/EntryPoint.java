package com.tutorial.design.pattern.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.MessageFormat;

public class EntryPoint {
    public static void main(String[] args) {
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println(MessageFormat.format("get session successfully: {0} ...", session.getClass().getName()));
        ConnectionUtil.shutdown();
        System.out.println("sessionFactory shutdown ...");
    }
}
