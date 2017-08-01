package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Function;
import com.model.Role;
import com.model.User;
import com.service.FunctionService;
import com.service.RoleService;
import com.service.UserService;

/**
 * <p>管理员功能模块控制器</p>
 * @author peach
 * @Time 2017-06-18 21:32:27
 */
@Controller
@RequestMapping(value="/user/root")
public class RootController {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private FunctionService functionService;
	
	@RequestMapping(value="/userManage")
	public ModelAndView toUserManage(){
		Map<String, List<?>> model = new HashMap<>();
		List<User> allUser = userService.getAllUser();
		List<Role> allRole = roleService.getAllRole(true);
		model.put("allUser", allUser);
		model.put("allRole", allRole);
		return new ModelAndView("root/userManage", model);
	}
	
	@RequestMapping(value="/functionManage")
	public ModelAndView toFunctionManage(){
		List<Function> functions = functionService.getAllFunction();
		Map<String, List<?>> model = new HashMap<>();
		model.put("functions", functions);
		return new ModelAndView("root/functionManage", model);		
	}
}
