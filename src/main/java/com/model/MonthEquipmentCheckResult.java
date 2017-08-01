package com.model;

public class MonthEquipmentCheckResult {
	private String item;
	private String result;
	private String date;
	
	public void setItem(String item){
		this.item = item;
	}
	
	public void setResult(String result){
		this.result = result;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public String getItem(){
		return item;
	}
	
	public String getResult(){
		return result;
	}
	
	public String getDate(){
		return date;
	}
}
