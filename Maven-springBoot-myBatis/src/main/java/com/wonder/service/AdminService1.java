package com.wonder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonder.mapper.AdminMapper;
import com.wonder.model.Admin;
@Service
public class AdminService1 {
	private AdminMapper adminMapper;
	
	@Autowired
	public AdminService1(AdminMapper adminMapper){
		this.adminMapper = adminMapper;
	}
	public List<Admin> getAdminAll() {
		return adminMapper.getAllAdmin();
	}
	
//	@Override
//    @Cacheable(value = "getAllTags", key = "#username")
//    public List<Tag> getAllTags(String username) {
//        return tagMapper.getAllTags(username);
//    }
}
