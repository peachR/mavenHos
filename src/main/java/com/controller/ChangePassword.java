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

@Controller
@RequestMapping(value="/changePassword")
public class ChangePassword {
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordHelper pswHelper;
	
	@RequestMapping(value="changePasswordAjax")
	@ResponseBody
	public Map<String,Boolean> handlerChangePasswordAjax(HttpServletRequest request){
		String number = request.getParameter("number");
		String password = request.getParameter("password");
		String newPassword = request.getParameter("newPassword");
		User user = userService.getUserByNumber(number);
		Map<String, Boolean> resultMap = new HashMap<>();
		if(user == null){
			resultMap.put("changeResult", false);
		}
		if(!pswHelper.encryPassword(number, password).equals(user.getPassword())){
			resultMap.put("changeResult", false);
			return resultMap;
		}else{
			user.setPassword(pswHelper.encryPassword(number, newPassword));
			userService.changeUserPassword(user);
			resultMap.put("changeResult", true);
			return resultMap;
		}
	}
}
