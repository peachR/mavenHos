package com.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.User;
public interface UserDao {
	public User getUser(User user);
	public List<User> getAllUser();
	public User getUserByNumber(@Param("Number")String Number);
	public User updateUser(User user);
	public void changeUserPassword(User user);
	public void insertUser(User user);
	public int deleteUser(@Param("id")int id);
	public void updateOnline(User user);
	public int isUserExist(@Param("number")String number);
}
