package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.EquipmentDao;
import com.model.Equipment;

@Service
public class EquipmentService {
	@Autowired
	private EquipmentDao equipmentDao;
	
	public List<Equipment> getAllEquipment(){
		return equipmentDao.getAllEquipment();
	}
	
	public void addNewEquipment(Equipment equipment){
		equipmentDao.AddNewEquipment(equipment);
	}
	
}
