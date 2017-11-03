package com.lanou3g.crm.action;

import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.service.impl.HomeService;
import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.service.impl.HomeServiecImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeAction extends ActionSupport {
    private HomeService service;

//    用来接收jsp传递过来的id
    private int deptId;
    private List<Department> departments;
    private List<Post> posts;


    public HomeAction() {
        service = new HomeServiecImpl();
    }

    public String home(){
//        获取所有部门信息
        departments = service.getDeparments();
        return SUCCESS;


    }


//    根据部门id获取对应的职位
    public String getPostByDeptId(){
        posts = service.getPostByDeptID(deptId);
        return SUCCESS;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDeparments(List<Department> deparments) {
        this.departments = deparments;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
