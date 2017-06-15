package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.PasswordHelper;
import com.service.UserService;

/**
 * 注册模块控制器
 * @author peach
 * @Time 2017-06-14 11:11:36
 */
@Controller
@RequestMapping(value="/register")
public class RegisterController {
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordHelper passwordHelper;
	
	@RequestMapping(value="/registerAjax")
	@ResponseBody
	public Map<String, Boolean> handlerRegisterAjax(HttpServletRequest request){
		Map<String, Boolean> registerMap = new HashMap<>();
		String number = request.getParameter("number");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		User user = new User();
		user.setNumber(number);
		user.setPassword(password);
		user.setName(name);
		passwordHelper.encrytPassword(user);
		try{
			userService.addNewUser(user);
		}catch(Exception ex){
			registerMap.put("register", false);
			ex.printStackTrace();
			return registerMap;
		}
		registerMap.put("register", true);
		return registerMap;
	}
	
	@RequestMapping(value="/isExist")
	@ResponseBody
	public Map<String, Boolean> handlerIsExistAjax(HttpServletRequest request){
		Map<String, Boolean> isExistMap = new HashMap<>();
		String number = request.getParameter("number");
		isExistMap.put("repeated", userService.isUserExist(number));
		return isExistMap;
	}
}
