package com.cg.pb.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.User;

public interface UserDAO {
	public void addUser();
	public HashMap<User, String> getUserHash();
	public ArrayList<User> getUserList();
}
