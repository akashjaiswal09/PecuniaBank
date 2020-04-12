package com.cg.pb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.pb.bean.User;

public interface UserService {
	public void addUser();
	public HashMap<User, String> getUserHash();
	public ArrayList<User> getUserList();
}
