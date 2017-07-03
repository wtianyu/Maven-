package com.wonder.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.wonder.model.Admin;
import com.wonder.service.AdminService1;


@Controller
public class AdminController {

	@Autowired
	private AdminService1 adminService;

//    @Autowired
//    public AdminController(AdminService adminService) {
//        this.adminService = adminService;
//    }
    
    @RequestMapping("/admin")
    @ResponseBody
    public String showAdmin() {
    	List<Admin> adminList = adminService.getAdminAll();
    	String adminStr = "init";
    	for (Admin admin : adminList) {
    		adminStr+=admin.getAdminName();
		}
    	return adminStr;
    }

}


