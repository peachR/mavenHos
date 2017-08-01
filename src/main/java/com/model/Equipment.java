package com.model;

import java.io.Serializable;

public class Equipment implements Serializable {
	private int id;
	private String name;
	private byte state;
	private int timeLength;
	private int beginTimeAM;
	private int endTimeAM;
	private int beginTimePM;
	private int endTimePM;
	private String treatmentItem;
	private String equipmentType;
	private int typeID;
	
	public void setID(int id){
		this.id = id;
	}
	
	public int getID(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setState(byte state){
		this.state = state;
	}
	
	public byte getState(){
		return this.state;
	}
	
	public void setTimeLength(int len){
		this.timeLength = len;
	}
	
	public int getTimeLength(){
		return this.timeLength;
	}
	
	public void setBeginTimeAM(int begAM){
		this.beginTimeAM = begAM;
	}
	
	public int getBeginTimeAM(){
		return this.beginTimeAM;
	}
	
	public void setEndTimeAM(int endAM){
		this.endTimeAM = endAM;
	}
	
	public int getEndTimeAM(){
		return this.endTimeAM;
	}
	
	public void setBeginTimePM(int begPM){
		this.beginTimePM = begPM;
	}
	
	public int getBeginTimePM(){
		return this.beginTimePM;
	}
	
	public void setEndTimePM(int endPM){
		this.endTimePM = endPM;
	}
	
	public int getEndTimePM(){
		return this.endTimePM;
	}
	
	public void setTreatmentItem(String treatmentItem){
		this.treatmentItem = treatmentItem;
	}
	
	public String getTreatmentItem(){
		return this.treatmentItem;
	}
	
	public void setEquipmentType(String equipmentType){
		this.equipmentType = equipmentType;
	}
	
	public String getEquipmentType(){
		return this.equipmentType;
	}
	
	public void setTypeID(int typeID){
		this.typeID = typeID;
	}
	
	public int getTypeID(){
		return this.typeID;
	}
}
