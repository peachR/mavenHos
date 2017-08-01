package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Group;
import com.model.User;
import com.service.GroupService;

@Controller
@RequestMapping(value="/root/group")
public class GroupManageController {
	@Autowired
	private GroupService groupService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView toGroupManage(){
		//System.out.println(id + " " + name);
		List<Group> list = groupService.getAllGroup();
		Map<String, List<Group>> model = new HashMap<>();
		model.put("group", list);
		return new ModelAndView("root/GroupManage", model);
	}
	
	@RequestMapping(value="/test",method=RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public User handlerTest(@RequestBody User user){
		System.out.println("success");
		System.out.println(user.getName() + " " + user.getId());
		return user;
	}
}
