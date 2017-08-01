package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.MonthEquipmentCheckResultDao;
import com.model.MonthEquipmentCheckResult;

@Service
public class MonthEquipmentCheckResultService {
	@Autowired
	private MonthEquipmentCheckResultDao mcheck;
	
	public List<MonthEquipmentCheckResult> getCheckResult(String cycle, String date, int eid){
		return mcheck.getEquipmentCheckResult(cycle, date, eid);
	}
}
