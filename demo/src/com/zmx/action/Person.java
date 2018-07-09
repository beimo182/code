package com.zmx.action;

import lombok.Data;
//使用lombok可以省略setter getter
@Data
public class Person {
	private Integer id;
	private String username;
	private Integer del;
	private String bz;
	
	
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
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
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	
}
