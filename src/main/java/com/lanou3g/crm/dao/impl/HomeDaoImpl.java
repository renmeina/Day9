package com.lanou3g.crm.dao.impl;

import com.lanou3g.crm.dao.HomeDao;
import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.service.utils.QueryUtil;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeDaoImpl implements HomeDao {
    public List<Department> getDeparments() {

        return QueryUtil.findAll(Department.class);
    }

    public List<Post> getPostByDeptID(int deptID) {

        return QueryUtil.queryByEqual(Post.class,"dept",deptID);
    }

    public List<Staff> getStaffByDeptIDAndPostID(int deptID, int postID) {
       String[] fields = {"dept","post"};
        Object[] values ={deptID,postID};
        return QueryUtil.queryByEquals(Staff.class,fields,values);
    }

    public List<Staff> getStaffByDeptID(int deptID) {
        return QueryUtil.queryByEqual(Staff.class,"dept",deptID);
    }

    public List<Staff> getStaffs() {
        return QueryUtil.findAll(Staff.class);
    }
}
