package com.cg.pb.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.User;

public class UserDAOImpl implements UserDAO {
	
//	DiagnosticCenterDaoImpl dc=new DiagnosticCenterDaoImpl();
	
	ArrayList<User> user=new ArrayList<User>();
	HashMap<User, String> userHash = new HashMap<>();
	User u1=new User("Akash","akash","akash");
	User u2=new User("Honey","honey","honey");
	User u3=new User("Abhishek","abhishek","abhishek");
	User u4=new User("Neha","neha","neha");
	User u5=new User("Srilatha","srilatha","srilatha");
	
			
	@Override
	public void addUser() {
		this.user.add(u1);
		this.userHash.put(u1, u1.getPswd());
		this.user.add(u2);
		this.userHash.put(u2, u2.getPswd());
		this.user.add(u3);
		this.userHash.put(u3, u3.getPswd());
		this.user.add(u4);
		this.userHash.put(u4, u4.getPswd());
		this.user.add(u5);
		this.userHash.put(u5, u5.getPswd());
		
	}
	@Override
	public HashMap<User, String> getUserHash() {
		return this.userHash;
	}
	@Override
	public ArrayList<User> getUserList() {
		return this.user;
	}
}
