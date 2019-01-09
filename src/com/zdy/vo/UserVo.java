package com.zdy.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserVo {
	private Integer id;
	private String username;
	private String email;
	private String address;
	//生日
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public UserVo(Integer id, String username, String email, String address,
			Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
	}
	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserVo(Integer id, String username, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", username=" + username + ", email="
				+ email + ", address=" + address + ", birthday=" + birthday
				+ "]";
	}
	
	
}
