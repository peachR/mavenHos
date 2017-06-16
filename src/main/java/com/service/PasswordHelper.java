package com.service;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import com.model.User;

/**
 * 密码加密服务类
 * @author peach
 * @Timer 2017-06-16 10:16:41
 */
@Service
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private final int hashIterations = 2;
	
	public void encrytPassword(User user){
		//user.setSalt(randomNumberGenerator.nextBytes().toHex());//加盐
		ByteSource credentialsSalt = ByteSource.Util.bytes(user.getNumber());
		String newPassword = new SimpleHash(
				algorithmName,user.getPassword(),
				credentialsSalt,
				hashIterations).toHex();
		user.setPassword(newPassword);
	}
	
	public String encryPassword(String number,String password){
		ByteSource credentialsSalt = ByteSource.Util.bytes(number);
		String newPassword = new SimpleHash(
				algorithmName,password,
				credentialsSalt,
				hashIterations).toHex();
		return newPassword;
	}
}
