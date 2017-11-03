package com.lanou3g.crm.service.utils;

import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;
import org.junit.Test;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class QueryUtilTes {
    @Test
    public void querryTest(){
        System.out.println(QueryUtil.findAll(Department.class));
        System.out.println(QueryUtil.findAll(Post.class));
        System.out.println(QueryUtil.findAll(Staff.class));
    }

    @Test
    public void querryTest2(){
        //查询部门ID为1的所有员工
       // List<Staff> list = QueryUtil.queryByEqual(Staff.class, "dept", 1);


//        查询部门gender为女的所有员工
        List<Staff> list1 = QueryUtil.queryByEqual(Staff.class, "gender", "女");
        System.out.println(list1);
    }

    @Test
    public void queryTest3(){
//        多条件查询
//        查询教学部的所有男员工
        String[] fields = new String[]{"dept","gender"};
        Object[] values ={1,"女"};
        List<Staff> staffs = QueryUtil.queryByEquals(Staff.class, fields, values);
        System.out.println(staffs);
    }

}