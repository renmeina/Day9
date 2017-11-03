package com.lanou3g.crm.domain;

import com.lanou3g.crm.service.impl.HomeService;
import com.lanou3g.crm.service.impl.HomeServiecImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/3.
 */
public class StaffsAction  extends ActionSupport{

//        J接收表单传递过来的Id
    private int deptId;
    private int postId;
//    数据都在这里面封装的
    private HomeService homeService;
    private List<Staff> staffs;

    public StaffsAction() {
        homeService=new HomeServiecImpl();
    }

    public String staffs(){
//        查询所有结果
        staffs = homeService.getStaffByDeptIDAndPostID(deptId, postId);
        return SUCCESS;
    }
    public String staffsJson(){
//        查询所有结果
        staffs = homeService.getStaffByDeptIDAndPostID(deptId, postId);
        return SUCCESS;
    }


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public HomeService getHomeService() {
        return homeService;
    }

    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
