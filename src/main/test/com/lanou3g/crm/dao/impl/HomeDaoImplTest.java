package com.lanou3g.crm.dao.impl;

import com.lanou3g.crm.dao.HomeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeDaoImplTest {
    private HomeDao dao;
    @Before
    public void setUp() throws Exception {
        dao = new HomeDaoImpl();
    }

    @Test
    public void getDeparments() throws Exception {
//测试集合大小 是否等于2
        Assert.assertEquals(dao.getDeparments().size(),2);
    }

    @Test
    public void getPostByDeptID() throws Exception {

        Assert.assertEquals(dao.getPostByDeptID(1).size(),3);
    }

    @Test
    public void getStaffByDeptIDAndPostID() throws Exception {
//职业规划部 职业规划师 有几个
        Assert.assertEquals(dao.getStaffByDeptIDAndPostID(2,5).size(),1);
    }

    @Test
    public void getStaffByDeptID() throws Exception {
//教学部有几个人
        Assert.assertEquals(dao.getStaffByDeptID(1).size(),6);
    }

    @Test
    public void getStaffs() throws Exception {
//        员工是否有八个人
        Assert.assertEquals(dao.getStaffs().size(),8);

    }

}