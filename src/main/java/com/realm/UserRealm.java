package com.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.User;
import com.service.PasswordHelper;
import com.service.UserService;

public class UserRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;

	/**
	 * 提供用户信息返回权限信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {		
		Set<String> roleNames = new HashSet<String>();
	    Set<String> permissions = new HashSet<String>();
	    //roleNames.add("admin");//添加角色。对应到index.jsp
	    //roleNames.add("authc");
	    permissions.add("create");//添加权限,对应到index.jsp
	    permissions.add("/");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
	    info.setStringPermissions(permissions);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName = (String) token.getPrincipal();
		User user = userService.getUserByNumber(userName);
		if(user == null){
			throw new IncorrectCredentialsException();
		}
		/*String psw = new String((char[])token.getCredentials());
		User user = new User();
		user.setNumber(userName);
		user.setPassword(psw);
		User ruser = userService.getUser(user);
		if(ruser == null){
			throw new IncorrectCredentialsException();
		}*/
		ByteSource credentialsSalt = ByteSource.Util.bytes(userName);
		//passwordHelper.encrytPassword(ruser);
		return new SimpleAuthenticationInfo(userName,user.getPassword(),credentialsSalt,getName());
	}

}
