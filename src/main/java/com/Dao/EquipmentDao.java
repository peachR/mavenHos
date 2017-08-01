package com.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Equipment;

public interface EquipmentDao {
	public List<Equipment> getAllEquipment();
	public void UpdateEquipment(@Param("equipment")Equipment equipment);
	public void AddNewEquipment(@Param("equipment")Equipment equipment);
	public void AddNewEquipments(@Param("equipments")List<Equipment> equipments);
}
