package com.tutorial.design.pattern.singleton;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.Serializable;

public final class ConnectionUtil implements Cloneable, Serializable {

    private ConnectionUtil() {
        System.out.println("creating instance ...");
        if (Holder.sessionFactory != null)
            throw new RuntimeException("can not create instance, please use getInstance() to create it ... ");
    }

    protected Object clone() throws CloneNotSupportedException {
        if (Holder.sessionFactory != null)
            throw new RuntimeException("can not create instance, please use getInstance() to create it ... ");
        return super.clone();
    }

    private Object readResolve() {
        System.out.println("applying readResolve ...");
        return Holder.sessionFactory;
    }

    private static class Holder {
        private static StandardServiceRegistry registry;
        private static SessionFactory sessionFactory;

        static {
            try {
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
    }

    public static void shutdown() {
        if (Holder.registry != null)
            StandardServiceRegistryBuilder.destroy(Holder.registry);
    }

    public static SessionFactory getSessionFactory() {
        return Holder.sessionFactory;
    }
}
