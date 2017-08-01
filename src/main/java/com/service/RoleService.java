package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.RoleDao;
import com.model.Role;

@Service
public class RoleService {
	@Resource
	private RoleDao roleDao;
	
	/**
	 * 获取全部角色
	 * @param needFunctions 是否需要读取角色的所含功能
	 * @return 角色列表
	 */
	public List<Role> getAllRole(boolean needFunctions){
		if(needFunctions){
			return roleDao.getAllRoleWithFunction();
		}else
			return roleDao.getAllRole();
	}
	
	public Role getRole(String name){
		return roleDao.getRole(name);
	}
	
}
