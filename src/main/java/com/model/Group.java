package com.model;

import java.util.List;

public class Group {
	private int groupID;
	private String name;
	private List<User> memeber;
	
	public void setGroupID(int gid){
		this.groupID = gid;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setMember(List<User> member){
		this.memeber = member;
	}
	
	public int getGroupID(){
		return this.groupID;
	}
	
	public String getName(){
		return this.name;
	}

	public List<User> getMember(){
		return this.memeber;
	}
}
