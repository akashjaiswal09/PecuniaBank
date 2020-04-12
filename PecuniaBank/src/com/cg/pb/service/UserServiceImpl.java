package com.cg.pb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.pb.bean.User;
import com.cg.pb.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {
	
//	DiagnosticCenterDaoImpl dc=new DiagnosticCenterDaoImpl();
	UserDAOImpl dao=new UserDAOImpl();
	
	@Override
	public void addUser() {
		dao.addUser();
		
	}
	@Override
	public HashMap<User, String> getUserHash() {
		return dao.getUserHash();
	}
	@Override
	public ArrayList<User> getUserList() {
		return dao.getUserList();
	}
}
