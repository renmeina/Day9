package com.lanou3g.crm.service.impl;

import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public interface HomeService {
    //    查询所有的部门的信息
    List<Department> getDeparments();

    //    根据部门查处所有职位信息
//    deptID 代表部门的ID
//    返回值为职位的集合
    List<Post> getPostByDeptID(int deptID);


    //    根据部门和职位的ID 查出所有对应的员工信息
//    postID 职位ID
//    返回值为员工集合
    List<Staff> getStaffByDeptIDAndPostID(int deptID,int postID);

    //    查询某个部门的所有员工
    List<Staff> getStaffByDeptID(int deptID);

    //    查询所有员工
    List<Staff> getStaffs();


}
