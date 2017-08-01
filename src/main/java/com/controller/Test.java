package com.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Equipment;
import com.model.MonthEquipmentCheckResult;
import com.service.EquipmentService;
import com.service.GroupService;
import com.service.MonthEquipmentCheckResultService;

@Controller
@RequestMapping(value="/test")
public class Test {
	@Autowired
	private MonthEquipmentCheckResultService mecs;
	@Autowired
	private GroupService groupService;
	@Autowired
	private EquipmentService equipmentService;
	
	@RequestMapping(value="/checkResult")
	public ModelAndView toCheckResult(){
		Map<String, List<MonthEquipmentCheckResult>> model = new HashMap<>();
		List<MonthEquipmentCheckResult> list = mecs.getCheckResult("day", "2017-07", 18);
		model.put("check", list);
		return new ModelAndView("test/test",model);
	}
	
	@RequestMapping(value="/addGroup")
	public void addGroup(){
		groupService.addNewGroup("test", Arrays.asList(1,2,7,8));
	}
	
	@RequestMapping(value="/updateGroup")
	public void updateGroup(){
		groupService.changeGroup(105, "change", Arrays.asList(10,11,13,20));
	}
	
	@RequestMapping(value="/showEquipment")
	@ResponseBody
	public List<Equipment> getAllEquipment(){
		return equipmentService.getAllEquipment();
	}
	
	@RequestMapping(value="/addNewEquipment", method=RequestMethod.POST)
	public void addNewEquipment(@RequestBody Equipment equipment){
		equipmentService.addNewEquipment(equipment);
	}
}
