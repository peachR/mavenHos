package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Role;
import com.service.RoleService;

@Controller
@RequestMapping(value="/user/roleManage")
public class RoleManageController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="")
	public String toRoleManage(){
		return "root/roleManage";
	}
	
	@RequestMapping(value="/getRoles")
	@ResponseBody
	public List<Role> handlerGetRoles(){
		return roleService.getAllRole(false);
	}
}
