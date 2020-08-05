package com.hotel.model.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.domain.Admin;


@Service
public class AdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	public Admin loginCheck(Admin admin) {
		return adminDAO.loginCheck(admin);
	}
	
	
}








