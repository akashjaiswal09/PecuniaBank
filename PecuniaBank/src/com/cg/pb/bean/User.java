package com.cg.pb.bean;

public class User {
	private String name;
	private String uname;
	private String pswd;
	public User(String name, String uname, String pswd) {
		super();
		this.name = name;
		this.uname = uname;
		this.pswd = pswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}
