package com.lanou3g.crm.service.impl;

import com.lanou3g.crm.dao.HomeDao;
import com.lanou3g.crm.service.impl.HomeService;
import com.lanou3g.crm.dao.impl.HomeDaoImpl;
import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeServiecImpl implements HomeService {
    private HomeDao dao;

    public HomeServiecImpl() {
        dao = new HomeDaoImpl();
    }

    public List<Department> getDeparments() {
        return dao.getDeparments();
    }

    public List<Post> getPostByDeptID(int deptID) {
        return dao.getPostByDeptID(deptID);
    }

    public List<Staff> getStaffByDeptIDAndPostID(int deptID, int postID) {
        if(deptID<0){
            return dao.getStaffs();
        }else if(deptID>0&&postID<0){
            return dao.getStaffByDeptID(deptID);

        }
        return dao.getStaffByDeptIDAndPostID(deptID,postID);
    }

    public List<Staff> getStaffByDeptID(int deptID) {
        if(deptID<0){
            return dao.getStaffs();
        }
        return dao.getStaffByDeptID(deptID);
    }

    public List<Staff> getStaffs() {
        return null;
    }
}
