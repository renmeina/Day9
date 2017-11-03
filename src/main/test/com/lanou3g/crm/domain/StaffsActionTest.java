package com.lanou3g.crm.domain;

import com.lanou3g.crm.service.impl.HomeService;
import com.lanou3g.crm.service.impl.HomeServiecImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/3.
 */
public class StaffsActionTest {
    @Test
    public void testQuery(){
        HomeService service = new HomeServiecImpl();
        List<Staff> staffs = service.getStaffByDeptIDAndPostID(1, 3);
        for(Staff staff:staffs){
            System.out.println(staff.getDept().getName());
            System.out.println(staff.getPost().getName());
        }
    }

}