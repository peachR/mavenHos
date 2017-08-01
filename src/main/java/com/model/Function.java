package com.model;

import java.io.Serializable;

public class Function implements Serializable {
	private int id;//功能id
	private String name;//功能名称
	private Navigation navigation;
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setNavigation(Navigation navigation){
		this.navigation = navigation;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public Navigation getNavigation(){
		return navigation;
	}
}
