package com.vti.model;

import java.util.Date;
import java.util.Objects;

public class User {
	private int ID;
	private boolean isLoggedIn = false;
	private String userName;
	private String fullName;
	private Date joinDate;

	public User() {
		super();
		this.isLoggedIn = false;
	}
	
	public User(String username) {
		super();
		this.userName = username;
	}

	public User(int iD, String userName, String fullName, Date joinDate) {
		super();
		this.ID = iD;
		this.userName = userName;
		this.fullName = fullName;
		this.joinDate = joinDate;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userName, other.userName);
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "\nUser: ID: "+ this.ID + 
				"\n\tUser name: " + userName +
				"\n\ttullName: " + fullName + 
				"\n\tJoin date: " + joinDate;
	}
	
	

}
