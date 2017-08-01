package com.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.MonthEquipmentCheckResult;

public interface MonthEquipmentCheckResultDao {
	public List<MonthEquipmentCheckResult> getEquipmentCheckResult(@Param("cycle")String cycle, @Param("date")String date, @Param("equipmentID")int eid);
}
