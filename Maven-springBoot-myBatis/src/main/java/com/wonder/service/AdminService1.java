package com.wonder.service;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wonder.mapper.AdminMapper;
import com.wonder.model.Admin;
@Service
@Transactional
public class AdminService1 {
	private AdminMapper adminMapper;
	
	@Autowired
	public AdminService1(AdminMapper adminMapper){
		this.adminMapper = adminMapper;
	}
	public List<Admin> getAdminAll() {
		List<Admin> adminList = adminMapper.getAllAdmin();
		adminList.get(0).setAdminName("wtiy123");
		return adminList;
	}
	
//	@Override
//    @Cacheable(value = "getAllTags", key = "#username")
//    public List<Tag> getAllTags(String username) {
//        return tagMapper.getAllTags(username);
//    }
}
