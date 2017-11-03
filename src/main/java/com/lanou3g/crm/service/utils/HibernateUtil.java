package com.lanou3g.crm.service.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by dllo on 17/11/2.
 */
public class HibernateUtil {
    private static final SessionFactory SF;
    static {
        try {
//            cmad + out+t
            SF = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("hibernate配置文件是不是写错了");
        }
    }

    public  static Session openSession(){
        Session session = SF.getCurrentSession();
//        开启事务
        session.beginTransaction();
        return session;
    }

    public static void commit(){
        SF.getCurrentSession().getTransaction().commit();
    }
}
