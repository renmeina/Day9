package com.lanou3g.crm.domain;

import com.lanou3g.crm.service.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/2.
 */
public class DepartmentTest {

    private Session session;

    @Test
    public void generateTable(){
//        SessionFactory sf = new Configuration().configure().buildSessionFactory();
//        Session session = sf.openSession();
//        session.beginTransaction();



//        Department d = new Department("教学部");
//        Post p = new Post("讲师");
//        Staff s = new Staff("胖哥","男",40);
//
//        session.save(d);
//        session.save(p);
//        session.save(s);

        //        调用这个方法 事务也出来了

        session = HibernateUtil.openSession();

        Department d1 = new Department("教学部");
        Department d2 = new Department("职业规划部");

        Post p1 = new Post("教学总监");
        Post p2 = new Post("教学主管");
        Post p3 = new Post("讲师");
        Post p4 = new Post("职业规划师");
        Post p5 = new Post("职业班主任");

        p1.setDept(d1);
        p2.setDept(d1);
        p3.setDept(d1);
        p4.setDept(d2);
        p5.setDept(d2);

//        session.save(p1);
//        session.save(p2);
//        session.save(p3);
//        session.save(p4);
//        session.save(p5);

        Staff s1 = new Staff("胖哥","男",40);
        s1.setDept(d1);
        s1.setPost(p1);
        Staff s2 = new Staff("大卫","女",14);
        s2.setDept(d1);
        s2.setPost(p2);
        Staff s3 = new Staff("玛丽","男",65);
        s3.setDept(d1);
        s3.setPost(p3);
        Staff s4 = new Staff("张娜","男",34);
        s4.setDept(d1);
        s4.setPost(p1);
        Staff s5 = new Staff("赵云","女",72);
        s5.setDept(d1);
        s5.setPost(p2);
        Staff s6 = new Staff("李四","男",45);
        s6.setDept(d1);
        s6.setPost(p3);
        Staff s7 = new Staff("王五","女",56);
        s7.setDept(d2);
        s7.setPost(p4);
        Staff s8 = new Staff("赵六","男",13);
        s8.setDept(d2);
        s8.setPost(p5);

        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(s5);
        session.save(s6);
        session.save(s7);
        session.save(s8);






//        session.getTransaction().commit();
        HibernateUtil.commit();
        //session.close();
    }

}