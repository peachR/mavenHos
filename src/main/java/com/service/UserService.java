package com.service;
import java.util.List;

/**
 * 用户服务层
 * @author peach
 * @Time 2017-05-25 16:01:04
 */
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Dao.UserDao;
import com.model.User;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public User getUser(User user){
		return userDao.getUser(user);
	}
	
	public void updateOnline(User user, byte on){
		user.setOn(on);
		this.userDao.updateOnline(user);
	}
	
	public void addNewUser(User user){
		this.userDao.insertUser(user);
	}
	
	public boolean isUserExist(String number){
		return this.userDao.isUserExist(number) > 0;
	}
	
	public User getUserByNumber(String number){
		return this.userDao.getUserByNumber(number);
	}
	
	public void changeUserPassword(User user){
		this.userDao.changeUserPassword(user);
	}
	
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}
}
